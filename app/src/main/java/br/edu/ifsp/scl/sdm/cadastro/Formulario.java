package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Formulario extends AppCompatActivity implements View.OnClickListener {

    //campos form
    private EditText textoName;
    private EditText textoPhone;
    private EditText textoEmail;
    private CheckBox selecionadoEmailCb;
    private RadioButton radioM;
    private Spinner ufSp;
    private EditText textCity;
    private Button limparBtn;
    private Button salvarBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoName = findViewById(R.id.textoName);
        textoName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(), charSequence, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        textoPhone = findViewById(R.id.textoPhone);
        textoPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(), charSequence, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        textoEmail = findViewById(R.id.textoEmail);
        textoEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(), charSequence, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        textCity = findViewById(R.id.textCity);
        textCity.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(), charSequence, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        selecionadoEmailCb = findViewById(R.id.selecionadoEmailCb);
        radioM = findViewById(R.id.radioM);

        //uf
        ufSp = findViewById(R.id.ufSp);
        ufSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //btn
        salvarBtn = findViewById(R.id.salvarBtn);
        salvarBtn.setOnClickListener((View.OnClickListener) this);

        limparBtn = findViewById(R.id.limparBtn);
    }

    public void limpaCampos(View view){
        textoName.getText().clear();
        textoEmail.getText().clear();
        textoPhone.getText().clear();
        textCity.getText().clear();
    }

    @Override
    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();

        sb.append(textoName.getText().toString());
        sb.append('\n');

        sb.append(textoPhone.getText().toString());
        sb.append('\n');

        sb.append(textoEmail.getText().toString());
        sb.append('\n');

        sb.append(textCity.getText().toString());
        sb.append('\n');

        sb.append(((TextView) ufSp.getSelectedView()).getText());
        sb.append('\n');

        sb.append(selecionadoEmailCb.isChecked() ? "selecionado" : "não selecionado");
        sb.append('\n');

        sb.append(radioM.isChecked() ? "Masculino" : "Feminino");
        sb.append('\n');

        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();

    }
}

