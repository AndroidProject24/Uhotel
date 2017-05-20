package com.acuteksolutions.uhotel.ui.adapter.concierge;

import android.widget.ImageView;

import com.acuteksolutions.uhotel.R;
import com.acuteksolutions.uhotel.libs.logger.Logger;
import com.acuteksolutions.uhotel.mvp.model.conciege.ParentalItem;
import com.acuteksolutions.uhotel.utils.ImageUtils;
import com.bumptech.glide.RequestManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class ParentalAdapter extends BaseQuickAdapter<ParentalItem, BaseViewHolder> {
  private RequestManager glide;
  private List<ParentalItem> list;
    public ParentalAdapter(RequestManager glide,List<ParentalItem> datas) {
        super(R.layout.concierge_parental_control_item,datas);
        this.glide=glide;
        this.list=datas;
    }

  @Override
  protected void convert(BaseViewHolder helper, ParentalItem data) {
    try {
        helper.setText(R.id.txtName, data.getName());
        Logger.e("name"+data.getName()+"isLocked:"+data.isLocked());
        ImageUtils.loadImage(glide,data.isLocked()?R.drawable.locked : R.drawable.opened,(ImageView) helper.getView(R.id.imageView));
        helper.getView(R.id.llBackground).setBackgroundResource(data.isLocked()? R.drawable.concierge_parental_circle_select_focus : R.drawable.concierge_parental_circle_no_focus);
        helper.getView(R.id.llBackground).setOnClickListener(v -> {
            data.setLocked(!data.isLocked());
            notifyItemChanged(helper.getAdapterPosition());
        });
    }catch (Exception e){
      e.printStackTrace();
    }
  }
  public void setEnable(boolean isEnable) {
    for (ParentalItem itemInfo : list) {
      itemInfo.setLocked(isEnable);
    }
    notifyDataSetChanged();
  }

  public List<ParentalItem> getList() {
    return list;
  }
}