package com.acuteksolutions.uhotel.ui.fragment.concierge;

import com.acuteksolutions.uhotel.R;
import com.acuteksolutions.uhotel.ui.fragment.base.BaseFragment;

/**
 * Created by Toan.IT
 * Date:22/04/2017
 */
public class MirrorFragment extends BaseFragment {

    public static MirrorFragment newInstance() {
        return new MirrorFragment();
    }

    @Override protected String getTAG() {
        return this.getClass().getSimpleName();
    }

    @Override protected void injectDependencies() {

    }

    @Override protected void initViews() {

    }

    @Override
    protected int setLayoutResourceID() {
        return R.layout.concierge_mirror_fragment;
    }

    @Override protected void initData() {

    }
}
