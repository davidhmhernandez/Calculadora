package com.calculadora;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	boolean decimal = false;
	boolean suma = false;
	boolean resta = false;
	boolean multiplicacion = false;
	boolean division = false;
	boolean potencia = false;

	Double[] numero = new Double[20];

	Double resultado = 0.0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button b0 = (Button) findViewById(R.id.btn0);
		b0.setOnClickListener(this);

		Button b1 = (Button) findViewById(R.id.btn1);
		b1.setOnClickListener(this);

		Button b2 = (Button) findViewById(R.id.btn2);
		b2.setOnClickListener(this);

		Button b3 = (Button) findViewById(R.id.btn3);
		b3.setOnClickListener(this);

		Button b4 = (Button) findViewById(R.id.btn4);
		b4.setOnClickListener(this);

		Button b5 = (Button) findViewById(R.id.btn5);
		b5.setOnClickListener(this);

		Button b6 = (Button) findViewById(R.id.btn6);
		b6.setOnClickListener(this);

		Button b7 = (Button) findViewById(R.id.btn7);
		b7.setOnClickListener(this);

		Button b8 = (Button) findViewById(R.id.btn8);
		b8.setOnClickListener(this);

		Button b9 = (Button) findViewById(R.id.btn9);
		b9.setOnClickListener(this);

		Button bSum = (Button) findViewById(R.id.btnSuma);
		bSum.setOnClickListener(this);

		Button bRes = (Button) findViewById(R.id.btnResta);
		bRes.setOnClickListener(this);

		Button bMul = (Button) findViewById(R.id.btnMulti);
		bMul.setOnClickListener(this);

		Button bDiv = (Button) findViewById(R.id.btnDiv);
		bDiv.setOnClickListener(this);

		Button bRai = (Button) findViewById(R.id.btnRaiz);
		bRai.setOnClickListener(this);

		Button bExp = (Button) findViewById(R.id.btnExp);
		bExp.setOnClickListener(this);

		Button bSen = (Button) findViewById(R.id.btnSen);
		bSen.setOnClickListener(this);

		Button bCos = (Button) findViewById(R.id.btnCos);
		bCos.setOnClickListener(this);

		Button bTan = (Button) findViewById(R.id.btnTan);
		bTan.setOnClickListener(this);

		Button bDel = (Button) findViewById(R.id.btnDel);
		bDel.setOnClickListener(this);

		Button bAc = (Button) findViewById(R.id.btnAc);
		bAc.setOnClickListener(this);

		Button bIgu = (Button) findViewById(R.id.btnIgual);
		bIgu.setOnClickListener(this);

		Button bPun = (Button) findViewById(R.id.btnPunt);
		bPun.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		TextView pantalla = (TextView) findViewById(R.id.texto);
		int seleccion = v.getId();
		String numeroS = pantalla.getText().toString();

		try {
			switch (seleccion) {

			case R.id.btn0:
				// Accion
				pantalla.setText(numeroS + "0");
				break;
			case R.id.btn1:
				// Accion
				pantalla.setText(numeroS + "1");
				break;
			case R.id.btn2:
				// Accion
				pantalla.setText(numeroS + "2");
				break;
			case R.id.btn3:
				// Accion
				pantalla.setText(numeroS + "3");
				break;
			case R.id.btn4:
				// Accion
				pantalla.setText(numeroS + "4");
				break;
			case R.id.btn5:
				// Accion
				pantalla.setText(numeroS + "5");
				break;
			case R.id.btn6:
				// Accion
				pantalla.setText(numeroS + "6");
				break;
			case R.id.btn7:
				// Accion
				pantalla.setText(numeroS + "7");
				break;
			case R.id.btn8:
				// Accion
				pantalla.setText(numeroS + "8");
				break;
			case R.id.btn9:
				// Accion
				pantalla.setText(numeroS + "9");
				break;
			case R.id.btnPunt:
				// Accion
				if (decimal == false) {
					pantalla.setText(numeroS + ".");
					decimal = true;
				} else {
					return;
				}
				break;
			case R.id.btnSuma:
				// Accion
				suma = true;
				numero[0] = Double.parseDouble(numeroS);
				pantalla.setText("");
				decimal = false;
				break;
			case R.id.btnResta:
				// Accion
				resta = true;
				numero[0] = Double.parseDouble(numeroS);
				pantalla.setText("");
				decimal = false;
				break;
			case R.id.btnMulti:
				// Accion
				multiplicacion = true;
				numero[0] = Double.parseDouble(numeroS);
				pantalla.setText("");
				decimal = false;
				break;
			case R.id.btnDiv:
				// Accion
				division = true;
				numero[0] = Double.parseDouble(numeroS);
				pantalla.setText("");
				decimal = false;
				break;
			case R.id.btnSen:
				// Accion
				numero[0] = Double.parseDouble(numeroS);
				resultado = Math.sin(numero[0]);
				pantalla.setText(String.valueOf(resultado));
				break;
			case R.id.btnCos:
				// Accion
				numero[0] = Double.parseDouble(numeroS);
				resultado = Math.cos(numero[0]);
				pantalla.setText(String.valueOf(resultado));
				break;
			case R.id.btnTan:
				numero[0] = Double.parseDouble(numeroS);
				resultado = Math.tan(numero[0]);
				pantalla.setText(String.valueOf(resultado));
				break;
			case R.id.btnRaiz:
				// Accion
				numero[0] = Double.parseDouble(numeroS);
				resultado = Math.sqrt(numero[0]);
				pantalla.setText(String.valueOf(resultado));
				break;
			case R.id.btnAc:
				// Accion
				pantalla.setText("");
				decimal = false;
				break;
			case R.id.btnDel:
				// Accion
				break;
			case R.id.btnIgual:

				// Accion
				numero[1] = Double.parseDouble(numeroS);
				if (suma) {
					resultado = numero[0] + numero[1];
					pantalla.setText(String.valueOf(resultado));
				} else if (resta) {
					resultado = numero[0] - numero[1];
					pantalla.setText(String.valueOf(resultado));
				} else if (multiplicacion) {
					resultado = numero[0] * numero[1];
					pantalla.setText(String.valueOf(resultado));
				} else if (division) {
					resultado = numero[0] / numero[1];
					pantalla.setText(String.valueOf(resultado));
				} else if (potencia) {
					resultado = Math.pow(numero[0], numero[1]);
					pantalla.setText(String.valueOf(resultado));

				}
				decimal = false;
				suma = false;
				resta = false;
				multiplicacion = false;
				division = false;
				potencia = false;
				break;

			case R.id.btnExp:
				potencia = true;
				numero[0] = Double.parseDouble(numeroS);
				pantalla.setText("");
				decimal = false;
				break;

			}
		} catch (Exception e) {
			pantalla.setText("Error");
		}
		;
	}

}
