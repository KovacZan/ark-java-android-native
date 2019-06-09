package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.arkecosystem.crypto.configuration.Network;
import org.arkecosystem.crypto.identities.Address;
import org.arkecosystem.crypto.identities.PublicKey;
import org.arkecosystem.crypto.identities.WIF;

import java.io.IOException;
import java.security.SecureRandom;
import java.security.spec.ECField;

import io.github.novacrypto.bip39.MnemonicGenerator;
import io.github.novacrypto.bip39.Words;
import io.github.novacrypto.bip39.wordlists.English;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Network.set(new ParkNet());
                try {
                    StringBuilder sb = new StringBuilder();
                    byte[] entropy = new byte[Words.TWELVE.byteLength()];
                    new SecureRandom().nextBytes(entropy);
                    new MnemonicGenerator(English.INSTANCE)
                            .createMnemonic(entropy, sb::append);
                    System.out.println("My passphrase: " + sb.toString());
                    System.out.println("Address: " + Address.fromPassphrase(sb.toString(), 55));
                    System.out.println("Public key: " + PublicKey.fromPassphrase(sb.toString()));

                    // System.out.println("To je: "+WIF.fromPassphrase("project eternal damage spare grant tube summer slot patrol unaware fossil exposeeeeer"));
                    //System.out.println(Address.validate(Address.fromPassphrase("project eternael damage spare grant tube summer slot patrol unaware fossil exprt", 55), 55));
                    //System.out.println("Address: " + Address.fromPassphrase("project eternael damage spare grant tube summer slot patrol unaware fossil exprt",55));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //new Thread()
                    //{
                    //    public void run() {
                    //        try {
                    //            ParkTransaction.CreateParkTransaction(10000, "PFfkYKD8uvXk7M7FY6kBTZdeWLpRcHABp3", "memory average vital away document demise nest glow mosquito mammal hold replace");
                    //        } catch (IOException e) {
                    //            e.printStackTrace();
                    //        }
                    //    }
                    //}.start();


            }
        });
    }

    //public static void main(String[] args) {
    //    try {
    //        ParkTransaction.CreateParkTransaction(10000, "PFfkYKD8uvXk7M7FY6kBTZdeWLpRcHABp3", "memory average vital away document demise nest glow mosquito mammal hold replace");
    //    } catch (IOException e) {
    //        e.printStackTrace();
    //    }
    //}
}
