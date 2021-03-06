package hernanrazo.fakerestaurant;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class orderFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_order, container, false);

        //instantiate each TextView in the confirm order section
        final TextView appetizerString =view.findViewById(R.id.appetizerString);
        final TextView entreeString = view.findViewById(R.id.entreeString);
        final TextView  kidsItemString = view.findViewById(R.id.kidsItemString);
        final TextView sideDishString = view.findViewById(R.id.sideDishString);
        final TextView dessertString = view.findViewById(R.id.dessertString);

        //set listener for order button
        //TODO: update whatever this button is going to do after order is confirmed
        Button orderButton = view.findViewById(R.id.orderButton);
        orderButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity().getBaseContext(), "Order Made!", Toast.LENGTH_SHORT).show();
            }
        });

        //set up all spinners and listeners for each section of the menu
        final Spinner appetizerSpinner = view.findViewById(R.id.appetizerSpinner);
        final ArrayAdapter<CharSequence> appetizerAdapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                                                                                      R.array.spinnerAppetizerStrings,
                                                                                      android.R.layout.simple_spinner_item);

        appetizerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        appetizerSpinner.setAdapter(appetizerAdapter);

        appetizerSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                String item = adapterView.getItemAtPosition(position).toString();

                switch(item) {
                    
                    case "French Fries":
                        //TODO: There's clearly a better way to do these string changes

                        final String frenchFries = "French Fries";
                        appetizerString.setText(frenchFries);
                        break;

                    case "Onion Rings":
                        final String onionRings = "Onion Rings";
                        appetizerString.setText(onionRings);
                        break;

                    case "Small Salad":
                        final String smallSalad = "Small Salad";
                        appetizerString.setText(smallSalad);
                        break;

                    case "Chicken Fingers":
                        final String chickenFingers = "Chicken Fingers";
                        appetizerString.setText(chickenFingers);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                final String nothingSelected = "Nothing Selected";
                appetizerString.setText(nothingSelected);
            }
        });

        Spinner entreeSpinner = view.findViewById(R.id.entreeSpinner);
        ArrayAdapter<CharSequence> entreeAdapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                                                                                   R.array.spinnerEntreeStrings,
                                                                                   android.R.layout.simple_spinner_item);

        entreeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        entreeSpinner.setAdapter(entreeAdapter);

        entreeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                String item = adapterView.getItemAtPosition(position).toString();

                switch(item) {

                    case "Cheese Burger":
                        final String cheeseBurger = "Cheese Burger";
                        entreeString.setText(cheeseBurger);

                        break;
                        //TODO: how do you spell caesar?????
                    case "Caeser Salad":
                        final String caeserSalad = "Caeser Salad";
                        entreeString.setText(caeserSalad);
                        break;

                    case "Basic Salad":
                        final String basicSalad = "Basic Salad";
                        entreeString.setText(basicSalad);
                        break;

                    case "Steak":
                        final String steak = "Steak";
                        entreeString.setText(steak);
                        break;

                    case "Tacos De Lengua":
                        final String tacosDeLengua = "Tacos De Lengua";
                        entreeString.setText(tacosDeLengua);
                        break;

                    case "Spicy Fish Fillet":
                        final String spicyFishFillet = "Spicy Fish Fillet";
                        entreeString.setText(spicyFishFillet);
                        break;

                    case "Rotisserie Chicken":
                        final String rotisserieChicken = "Rotisserie Chicken";
                        entreeString.setText(rotisserieChicken);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                final String nothingSelected = "Nothing Selected";
                entreeString.setText(nothingSelected);

            }
        });

        Spinner kidsMenuSpinner = view.findViewById(R.id.kidsMenuSpinner);
        ArrayAdapter<CharSequence> kidsMenuAdapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                                                                                     R.array.spinnerKidsMenuStrings,
                                                                                     android.R.layout.simple_spinner_item);
        kidsMenuAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        kidsMenuSpinner.setAdapter(kidsMenuAdapter);

        kidsMenuSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                String item = adapterView.getItemAtPosition(position).toString();

                switch(item) {

                    case "Chicken Fingers":
                        final String chickenFingers = "Chicken Fingers";
                        kidsItemString.setText(chickenFingers);
                        break;


                    case "Mac n Cheese":
                        final String macNCheese = "Mac N Cheese";
                        kidsItemString.setText(macNCheese);
                        break;

                    case "Fries":
                        final String fries = "Fries";
                        kidsItemString.setText(fries);
                        break;

                    case "Veggies LOL":
                        final String veggiesLOL = "Veggies LOL";
                        kidsItemString.setText(veggiesLOL);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                final String nothingSelected = "Nothing Selected";
                kidsItemString.setText(nothingSelected);
            }
        });

        Spinner sideDishSpinner = view.findViewById(R.id.sideDishSpinner);
        ArrayAdapter<CharSequence> sideDishAdapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                                                                                     R.array.spinnerSideDishStrings,
                                                                                     android.R.layout.simple_spinner_item);

        sideDishAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sideDishSpinner.setAdapter(sideDishAdapter);

        sideDishSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                String item = adapterView.getItemAtPosition(position).toString();

                switch(item) {

                    case "Sloppy Joe":
                        final String sloppyJoe = "Sloppy Joe";
                        sideDishString.setText(sloppyJoe);
                        break;

                    case "Side Salad":
                        final String sideSalad = "Side Salad";
                        sideDishString.setText(sideSalad);
                        break;

                    case "Chicken Fajitas":
                        final String chickenFajitas = "Chicken Fajitas";
                        sideDishString.setText(chickenFajitas);
                        break;

                    case "Rice":
                        final String rice = "Rice";
                        sideDishString.setText(rice);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                final String nothingSelected = "Nothing Selected";
                sideDishString.setText(nothingSelected);
            }
        });

        Spinner dessertSpinner = view.findViewById(R.id.desertSpinner);
        ArrayAdapter<CharSequence> dessertAdapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                                                                                   R.array.spinnerDesertStrings,
                                                                                   android.R.layout.simple_spinner_item);

        dessertAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dessertSpinner.setAdapter(dessertAdapter);

        dessertSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                String item = adapterView.getItemAtPosition(position).toString();

                switch(item) {

                    case "Flan":
                        final String flan = "Flan";
                        dessertString.setText(flan);
                        break;

                    case "Pot Brownies":
                        final String potBrownies = "Pot Brownies";
                        dessertString.setText(potBrownies);
                        break;

                    case "Chocolate Chip Cookies":
                        final String chocoChipCookies = "Chocolate Chip Cookies";
                        dessertString.setText(chocoChipCookies);
                        break;

                    case "Vanilla Eclair":
                        final String vanillaEclair = "Vanilla Eclair";
                        dessertString.setText(vanillaEclair);
                        break;

                    case "Bowl of Fruit":
                        final String bowlOfFruit = "Bowl of Fruit";
                        dessertString.setText(bowlOfFruit);
                        break;

                    case "Chocolate Pudding":
                        final String chocoPudding = "Chocolate Pudding";
                        dessertString.setText(chocoPudding);
                        break;

                    case "Lemon Cake":
                        final String lemonCake = "Lemon Cake";
                        dessertString.setText(lemonCake);
                        break;

                    case "Tres Leches":
                        final String tresLeches = "Tres Leches";
                        dessertString.setText(tresLeches);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                final String nothingSelected = "Nothing Selected";
                dessertString.setText(nothingSelected);
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}