package edu.quinnipiac.ser210.navdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CoinInfoFragment extends Fragment {


    private CoinHolder[] coinInfoArray;
    public CoinInfoFragment() {
        // Required empty public constructor
    }

    public static CoinInfoFragment newInstance(Bundle bundle) {
        Bundle fragBundle = bundle;

        CoinInfoFragment fragment = new CoinInfoFragment();
        fragment.setArguments(fragBundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        readBundle(getArguments());
        return inflater.inflate(R.layout.fragment_coin_info, container, false);
    }

    private void readBundle(Bundle bundle) {
        if (bundle != null) {
            coinInfoArray = ( (CoinHolder[]) bundle.getSerializable("data"));
        }
    }

}
