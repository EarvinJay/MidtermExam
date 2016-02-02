package sidespell.tech.midtermexam.fragments;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by srthg on 2/2/2016.
 */
public class Album {
    public ImageView imgAlbum;
    public TextView tvname;
    public TextView tvArtist;

    public ImageView getImgAlbum() {
        return imgAlbum;
    }

    public void setImgAlbum(ImageView imgAlbum) {
        this.imgAlbum = imgAlbum;
    }

    public TextView getTvname() {
        return tvname;
    }

    public void setTvname(TextView tvname) {
        this.tvname = tvname;
    }

    public TextView getTvArtist() {
        return tvArtist;
    }

    public void setTvArtist(TextView tvArtist) {
        this.tvArtist = tvArtist;
    }

    public Album(ImageView imgAlbum, TextView tvname, TextView tvArtist) {

        this.imgAlbum = imgAlbum;
        this.tvname = tvname;
        this.tvArtist = tvArtist;
    }

    public Album() {

    }

}