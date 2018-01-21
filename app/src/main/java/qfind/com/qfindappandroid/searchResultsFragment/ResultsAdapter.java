package qfind.com.qfindappandroid.searchResultsFragment;


import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import qfind.com.qfindappandroid.R;

public class ResultsAdapter extends RecyclerView.Adapter<ResultsAdapter.MyViewHolder> {

    private Context mContext;
    private List<SearchedItem> itemList;
    private Typeface mTypeFace;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, description;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.search_item_title);
            description = (TextView) view.findViewById(R.id.search_item_description);
            thumbnail = (ImageView) view.findViewById(R.id.search_thumbnail);
            setFontTypeForText(title, description);
        }
    }

    public void setFontTypeForText(TextView title, TextView description) {
        if (mContext.getResources().getConfiguration().locale.getLanguage().equals("en")) {
            mTypeFace = Typeface.createFromAsset(mContext.getAssets(),
                    "fonts/Lato-Light.ttf");
        } else {
            mTypeFace = Typeface.createFromAsset(mContext.getAssets(),
                    "fonts/GE_SS_Unique_Light.otf");
        }
        title.setTypeface(mTypeFace);
        description.setTypeface(mTypeFace);
    }

    public ResultsAdapter(Context mContext, List<SearchedItem> searchedItemList) {
        this.mContext = mContext;
        this.itemList = searchedItemList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.search_results_item_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        SearchedItem album = itemList.get(position);
        holder.title.setText(album.getItem());
        holder.description.setText(album.getItemDescription());

        // loading album cover using Glide library
        Picasso.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }
}