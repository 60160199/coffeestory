package com.example.apinew

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction

/**
 * A simple [Fragment] subclass.
 */
class login : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_login, container, false)
        // Inflate the layout for this fragment

        val button : Button = view.findViewById(R.id.btnNextPage);


        button.setOnClickListener {
            val usrInput : EditText = view.findViewById(R.id.user_input);
            val passInput : EditText = view.findViewById(R.id.pass_input);

            val msgUsrInput: String = usrInput.text.toString()
            val passUsrInput: String = passInput.text.toString()

            if(msgUsrInput.trim().length>0&&passUsrInput.trim().length>0){
                if(msgUsrInput!=passUsrInput){
                    Toast.makeText(context,"Sorry username or password is wrong !!! (not match)", Toast.LENGTH_LONG).show()
                }else{
                    if(msgUsrInput=="60160199"){
                        Toast.makeText(context,"Welcome : "+usrInput.text.toString()+" !!! ", Toast.LENGTH_LONG).show()
                        val fragment_menu = menu()
                        val fm = fragmentManager
                        val transaction : FragmentTransaction = fm!!.beginTransaction()
                        transaction.replace(R.id.layout, fragment_menu,"fragment_list_view")
                        transaction.addToBackStack("fragment_list_view")
                        transaction.commit()
                    }else{
                        Toast.makeText(context,"Sorry username or password is wrong !!! (not found)", Toast.LENGTH_LONG).show()
                    }
                }

            }else{
                Toast.makeText(context,"Sorry username or password is wrong (empty)!!!", Toast.LENGTH_LONG).show()
            }

        }

        return view;
    }

}
