package com.example.myfoodapp.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.HomeHorAdapter;
import com.example.myfoodapp.adapters.HomeVerAdapter;
import com.example.myfoodapp.databinding.FragmentHomeBinding;
import com.example.myfoodapp.models.HomeHorModel;
import com.example.myfoodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

RecyclerView homeHorizontalRec,homeVerticalRec;
List<HomeHorModel> homeHorModelList;
HomeHorAdapter homeHorAdapter;

///////////////////////////////////Vertical

    List<HomeVerModel>homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, container.isAttachedToWindow());

        homeHorizontalRec = root.findViewById(R.id.home_hor__rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        //////////////////////////////Horizontal RecyclerView

        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.pizza,"Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger,"HamBurger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fried_potatoes,"Fries"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ice_cream,"Ice Cream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich,"Sandwich"));

        homeHorAdapter = new HomeHorAdapter(getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);


        //////////////////////////////Vertical RecyclerView

        homeVerModelList = new ArrayList<>();

        homeVerModelList.add(new HomeVerModel(R.drawable.pizza1,"Pizza","10:00-23:00","4.9","Min - R$34"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza2,"Pizza","10:00-23:00","4.9","Min - R$34"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza3,"Pizza","10:00-23:00","4.9","Min - R$34"));

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);

        return root;

    }
}