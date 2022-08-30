package com.example.loginscreen

import android.app.Application
import android.content.Context
import android.view.View
import android.widget.LinearLayout
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.graphics.Insets.add
import androidx.core.view.get
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import io.github.farshidroohi.ChartEntity
import io.github.farshidroohi.LineChart

@Composable
fun DashBoard (navController: NavController) {

 Graph()

    }

@Composable
 fun Graph(){

    AndroidView(modifier = Modifier
        .fillMaxWidth()
        .height(400.dp),
        factory = {
//            LineChart(context)
        View.inflate(it,R.layout.line_chart_custom,null)
                  },

        update = {

               val model = AndroidViewModel(application = Application())

//            val graph1 = floatArrayOf(
//                0f, 33000f, 188000f, 695000f, 324000f, 230000f, 188000f, 15000f, 126000f, 5000f, 33000f
//            )
//                val graph2 = floatArrayOf(
//                    100000f, 245000f, 101100f, 1000f, 0f, 0f, 47000f, 20000f, 12000f, 124400f, 160000f
//                )


            val view = it.findViewById<LineChart>(R.id.line_chart)

            val firstChartEntity = ChartEntity(R.color.purple_700,model.graph1)
            val secondChartEntity = ChartEntity(R.color.teal_200, model.graph2)

            val list = ArrayList<ChartEntity>().apply {
                add(firstChartEntity)
                add(secondChartEntity)
            }
            view.setLegend(model.legendArr)
            view.setList(list)

        })

}
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun LinePreview(){
////    DashBoard()
//    Graph()
//
//}















