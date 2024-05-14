package com.example.imagepro;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {

    private RecyclerView recyclerView;
    private List<Sign> signList;
    private SignAdapter signAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment and hold the reference to it
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize the signList as an ArrayList
        signList = new ArrayList<>();

        // Use the view reference to find the RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        // Set the LayoutManager for the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        signList = new ArrayList();

        // Create a new Sign and add it to the list
        signList.add(new Sign(R.drawable.a, "A", "Sağ elin işaret ve orta parmakları birleştirilir ve diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.b, "B", "Sağ elin işaret parmağı dik konumda tutulurken, diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.c, "C", "Sağ elin işaret ve baş parmağı birleştirilerek C şekli oluşturulur"));
        signList.add(new Sign(R.drawable.d, "D", "Sağ elin işaret parmağı yukarı kaldırılır ve baş parmak ile birleştirilerek D şekli oluşturulur"));
        signList.add(new Sign(R.drawable.e, "E", "Sağ elin işaret parmağı ve baş parmağı birleştirilir, diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.f, "F", "Sağ elin işaret parmağı ve baş parmağı birleştirilerek F şekli oluşturulur, diğer parmaklar açık kalır"));
        signList.add(new Sign(R.drawable.g,  "G", "Sağ elin işaret parmağı yukarı kaldırılır ve diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.h, "H", "Sağ elin işaret ve orta parmakları birleştirilir ve yukarı kaldırılır, diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.i, "I", "Sağ elin küçük parmağı yukarı kaldırılır ve diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.j, "J", "Sağ elin küçük parmağı yukarı kaldırılır ve J harfi şeklinde bir hareket yapılır"));
        signList.add(new Sign(R.drawable.k, "K", "Sağ elin işaret ve orta parmakları V şeklinde açılır ve diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.l, "L", "Sağ elin işaret parmağı ve baş parmağı L şeklinde açılır, diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.m, "M", "Sağ elin üç parmağı (işaret, orta, yüzük) birleştirilir ve baş parmak ile birleştirilerek M şekli oluşturulur"));
        signList.add(new Sign(R.drawable.n, "N", "Sağ elin iki parmağı (işaret ve orta) birleştirilir ve baş parmak ile birleştirilerek N şekli oluşturulur"));
        signList.add(new Sign(R.drawable.o, "O", "Sağ elin işaret parmağı ve baş parmağı birleştirilerek O şekli oluşturulur"));
        signList.add(new Sign(R.drawable.p, "P", "Sağ elin işaret parmağı ve baş parmağı birleştirilir, diğer parmaklar kapanır, el yana doğru tutulur"));
        signList.add(new Sign(R.drawable.r, "R", "Sağ elin işaret parmağı ve baş parmağı birleştirilir, diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.s, "S", "Sağ el yumruk şeklinde kapatılır ve baş parmak yan tarafa doğru çıkarılır"));
        signList.add(new Sign(R.drawable.t, "T", "Sağ elin işaret parmağı yukarı kaldırılır ve diğer parmaklar kapanır, baş parmak işaret parmağının altına yerleştirilir"));
        signList.add(new Sign(R.drawable.u, "U", "Sağ elin işaret ve orta parmakları birleştirilir ve yukarı kaldırılır, diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.v, "V", "Sağ elin işaret ve orta parmakları V şeklinde açılır ve diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.y, "Y", "Sağ elin işaret ve baş parmağı Y şeklinde açılır ve diğer parmaklar kapanır"));
        signList.add(new Sign(R.drawable.z, "Z", "Sağ elin işaret parmağı ile Z harfi şeklinde bir hareket yapılır"));


        // Initialize the adapter with the list and set it to the RecyclerView
        signAdapter = new SignAdapter((ArrayList<Sign>) signList);
        recyclerView.setAdapter(signAdapter);

        return view; // Return the view reference here
    }
}
