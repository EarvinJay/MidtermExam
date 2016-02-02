package sidespell.tech.midtermexam.fragments;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import sidespell.tech.midtermexam.R;


/**
 * Created by srthg on 2/2/2016.
 */

    public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {
        private Context mContext;
        private int mLayoutId;
        private List<Album> mAlbum;

        public AlbumAdapter(Context context, int resource, List<Album> album) {


            mContext = context;
            mLayoutId = resource;
            mAlbum = album;
        }


        @Override
        public AlbumAdapter.AlbumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(mContext).inflate(mLayoutId, parent, false);
            return new AlbumViewHolder(view);

        }

        @Override
        public void onBindViewHolder(AlbumAdapter.AlbumViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return mAlbum.size();
        }

        static class AlbumViewHolder extends RecyclerView.ViewHolder {
            public CardView cardView;
            public ImageView imgAlbum;
            public TextView tvname;
            public TextView tvArtist;

            public AlbumViewHolder(View view) {
                super(view);
                cardView = (CardView) view.findViewById(R.id.cardView);
                imgAlbum = (ImageView) view.findViewById(R.id.imageView);
                tvname = (TextView) view.findViewById(R.id.tvname);
                tvArtist = (TextView) view.findViewById(R.id.tvartist);


            }
        }
    }




