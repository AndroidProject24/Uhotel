package com.acuteksolutions.uhotel.ui.fragment.roomService;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.acuteksolutions.uhotel.R;
import com.acuteksolutions.uhotel.mvp.model.data.VODInfo;
import com.acuteksolutions.uhotel.mvp.presenter.movies.MoviesPresenter;
import com.acuteksolutions.uhotel.mvp.view.movies.MoviesView;
import com.acuteksolutions.uhotel.ui.adapter.movies.MoviesAdapter;
import com.acuteksolutions.uhotel.ui.fragment.BaseFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

public class RoomServiceFragment extends BaseFragment implements MoviesView {
  @Inject
  MoviesPresenter
  mPresenter;
  private Context mContext;
  @BindView(R.id.recyclerview)
  RecyclerView mRecyclerview;
  public static RoomServiceFragment newInstance() {
    return new RoomServiceFragment();
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    mContext=context;
  }

  @Override
  protected String getTAG() {
    return this.getClass().getSimpleName();
  }

  @Override
  protected void initViews() {

    initRecyclerview();
  }

  @Override
  protected int setLayoutResourceID() {
    return R.layout.movies_fragment;
  }

  @Override
  protected void initData() {
    //mPresenter.getData(TheloaiDef.HOA_MANG_TRA_TRUOC);
  }

  private void initRecyclerview(){
    mRecyclerview.setLayoutManager(new LinearLayoutManager(mContext));
    mRecyclerview.setHasFixedSize(true);
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    mPresenter.detachView();
  }

  @Override
  public void listMovies(List<VODInfo> moviesList) {
    MoviesAdapter moviesAdapter =new MoviesAdapter(moviesList);
    moviesAdapter.openLoadAnimation();
    mRecyclerview.setAdapter(moviesAdapter);
  }
}
