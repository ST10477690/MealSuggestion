package za.ac.iie.mymeals

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtTimeOfDay = findViewById<EditText>(R.id.edtTimeOfDay)
        val txtSuggestion = findViewById<TextView>(R.id.txtSuggestion)
        val btnSuggestMeal = findViewById<Button>(R.id.btnSuggestMeal)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnSuggestMeal.setOnClickListener{
            val Day = edtTimeOfDay.text.toString()
            var Suggestion = ""

            if (Day == "Breakfast" ){
               Suggestion = "omelette,mushrooms,roasted tomatoes"
            } else if (Day == "Brunch"){
               Suggestion = "garlic bread and bacon"
            } else if (Day == "Lunch") {
              Suggestion =  "chicken and mayo sandwich with orange juice"
            } else if (Day == "Snack"){
               Suggestion = "fresh fruit with yoghurt"
            } else if (Day == "Dinner"){
               Suggestion = "grilled chicken,mash potatoes and broccoli"
            } else if (Day == "Dessert"){
                Suggestion ="cheesecake with strawberry syrup"
            }

              txtSuggestion.text = Suggestion

            btnClear.setOnClickListener{
                edtTimeOfDay.text.clear()
                txtSuggestion.text = ""


            }



        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
