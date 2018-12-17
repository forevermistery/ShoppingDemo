package com.example.administrator.shoppingdemo.home.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.administrator.shoppingdemo.R;

public class HomeFragment extends Fragment implements View.OnClickListener {


    private RecyclerView rvHome;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);  // View android.view.LayoutInflater.inflate(int resource, ViewGroup root)
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvHome = (RecyclerView) view.findViewById(R.id.rv_home);
        view.findViewById(R.id.ib_top).setOnClickListener(this);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ib_top:
                Toast.makeText(getActivity(),"1Rx",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
