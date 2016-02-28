package com.example.ermesonnobrega.roteiro01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

    }
        public class CadastroActivity extends AppCompatActivity {


            private EditText mNome;
            private EditText mSobrenome;
            private EditText mUsuario;
            private EditText mSenha;
            private EditText mConfirmarSenha;
            private Button btn;

            private void logar() {
                String nome = mNome.getText().toString();
                String sobrenome = mSobrenome.getText().toString();
                String identUsuario = mUsuario.getText().toString();
                String senha = mSenha.getText().toString();
                String confirmarsenha = mConfirmarSenha.getText().toString();

                if (nome.equalsIgnoreCase("ermeson") && sobrenome.equalsIgnoreCase("nobrega") && identUsuario.equalsIgnoreCase("123")
                        && senha.equalsIgnoreCase("123") && confirmarsenha.equals(senha)) {
                    Intent intent = new Intent(this, MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("nome", nome);
                    intent.putExtras(bundle);
                    startActivity(intent);
                    finish();


                } else {
                    View focus = null;
                    boolean exibir = false;
                    if (TextUtils.isEmpty(nome)) {
                        mNome.setError("Campo vazio");
                        focus = mNome;
                        exibir = true;
                    }
                    if (TextUtils.isEmpty(sobrenome)) {
                        mSobrenome.setError("Campo vazio");
                        focus = mSobrenome;
                        exibir = true;
                    }
                    if (TextUtils.isEmpty(identUsuario)) {
                        mUsuario.setError("Campo vazio");
                        focus = mUsuario;
                        exibir = true;
                    }
                    if (TextUtils.isEmpty(senha)) {
                        mSenha.setError("Campo vazio");
                        focus = mSenha;
                        exibir = true;

                    }
                    if (TextUtils.isEmpty(confirmarsenha)) {
                        mConfirmarSenha.setError("Campo vazio");
                        focus = mConfirmarSenha;
                        exibir = true;

                    }

                }
            }

        }    }
    