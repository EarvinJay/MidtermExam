package sidespell.tech.midtermexam.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import sidespell.tech.midtermexam.R;

public class MainFragment extends Fragment {


    private EditText meditext;
    private TextView mTvEmpty,mtvName,mtvArtist;
    private ImageView img;
    private ProgressBar mProgressBar;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        // TODO: Find all views here..

        meditext=(EditText) view.findViewById(R.id.etAlbum);
        mTvEmpty = (TextView) view.findViewById(android.R.id.empty);
        mtvName=(TextView) view.findViewById(R.id.tvname);
        mtvArtist=(TextView) view.findViewById(R.id.tvartist);
        mProgressBar=(ProgressBar) view.findViewById(R.id.progressBar);

        return view;

    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // TODO: Perform logic operations here..

}





}
