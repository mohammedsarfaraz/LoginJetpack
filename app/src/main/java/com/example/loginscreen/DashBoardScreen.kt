package com.example.loginscreen

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
import androidx.navigation.NavController
import io.github.farshidroohi.ChartEntity
import io.github.farshidroohi.LineChart

@Composable
fun DashBoard (navController: NavController) {


//     fun lineChartData() = listOf(
//        5929, 6898, 8961, 5674, 7122, 2092, 3427, 5520, 4680, 7418,
//        4743, 4280, 12211, 7295, 9900, 12438, 11186, 5439, 4227, 5138,
//        11015, 8386, 12450, 10411, 10852, 7782, 7371, 4983, 9234, 6847
//    )

//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(360.dp)
//            .padding(16.dp),
//        elevation = 10.dp
//    ) {
//        Column(
//            modifier = Modifier
//                .padding(16.dp)
//                .wrapContentSize(align = Alignment.BottomStart)
//        ) {
//            androidx.compose.foundation.Canvas(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(250.dp)
//            ) {
//                val distance = size.width / (lineChartData().size + 1)
//                var currentX = 0F
//                val maxValue = lineChartData().maxOrNull() ?: 0
//                val points = mutableListOf()
//
//                lineChartData().forEachIndexed { index, data ->
//                    if (lineChartData().size >= index + 2) {
//                        val y0 = (maxValue - data) * (size.height / maxValue)
//                        val x0 = currentX + distance
//                        points.add(PointF(x0, y0))
//                        currentX += distance
//                    }
//                }
//
//                for (i in 0 until points.size - 1) {
//                    drawLine(
//                        start = Offset(points[i].x, points[i].y),
//                        end = Offset(points[i + 1].x, points[i + 1].y),
//                        color = Color(0xFF3F51B5),
//                        strokeWidth = 8f
//                    )
//                }
//            }
//        }
//    }
}

@Composable
 fun Graph(){
//    lateinit var linechart: LineChart
//    var lineChart: MutableList<LineChart> = mutableListOf()


//            val legendArr = listOf("05/21", "05/22", "05/23", "05/24", "05/25")




    AndroidView(modifier = Modifier
        .fillMaxWidth()
        .height(400.dp),
        factory = {
//            LineChart(context)
        View.inflate(it,R.layout.line_chart_custom,null)
                  },

        update = {

            val graph1 = floatArrayOf(
                0f,
                33000f,
                188000f,
                695000f,
                324000f,
                230000f,
                188000f,
                15000f,
                126000f,
                5000f,
                33000f
            )
                val graph2 = floatArrayOf(
                    100000f, 245000f, 101100f, 1000f, 0f, 0f, 47000f, 20000f, 12000f, 124400f, 160000f
                )
              val view = it.findViewById<LineChart>(R.id.line_chart)

            val firstChartEntity = ChartEntity(R.color.purple_700, graph1)
            val secondChartEntity = ChartEntity(R.color.teal_200, graph2)
            val legendArr = listOf("05/21", "05/22", "05/23", "05/24", "05/25", "05/26", "05/27", "05/28", "05/29", "05/30", "05/31")

            val list = ArrayList<ChartEntity>().apply {
                add(firstChartEntity)
                add(secondChartEntity)
            }
            view.setLegend(legendArr)
            view.setList(list)

//            view.x.apply {
////                var chartXLength =  listOf("05/21", "05/22", "05/23", "05/24", "05/25")
//
//            }
//            view.apply {
//
////                val graph1 = floatArrayOf(113000f, 183000f, 188000f, 695000f, 324000f)
////                val graph2 = floatArrayOf(0f, 245000f, 1011000f, 1000f, 0f, 0f, 47000f)
//
//                val arrGraph = ArrayList<ChartEntity>().apply {
////                    add(ChartEntity(android.graphics.Color.GRAY, graph1))
////                    add(ChartEntity(android.graphics.Color.WHITE, graph2))
//                }
//                linechart.setList(arrGraph)
//            }
////
//            val graph1 = floatArrayOf(113000f, 183000f, 188000f, 695000f, 324000f)
//            val graph2 = floatArrayOf(0f, 245000f, 1011000f, 1000f, 0f, 0f, 47000f)


//
        })




}







//    val graph1 = floatArrayOf(113000f, 183000f, 188000f, 695000f, 324000f, 230000f, 188000f)
//    val graph2 = floatArrayOf(0f, 245000f, 1011000f, 1000f, 0f, 0f, 47000f)
//     val legendArr = listOf("05/21", "05/22", "05/23", "05/24", "05/25", "05/26", "05/27", "05/28", "05/29", "05/30", "05/31")
//
//
//
//    val firstChartEntity = ChartEntity(0xFFFFFF, graph1)
//    val secondChartEntity = ChartEntity(0xFFF00, graph2)
//
//    val list = ArrayList<ChartEntity>().apply {
//        add(firstChartEntity)
//        add(secondChartEntity)
////        add(ChartEntity(0xFFFFFF,graph1))
////        add(ChartEntity(0xFFF00,graph2))
//    }
//
//
//    val context = LocalContext.current
//    val lineChart = LineChart(context)
//    lineChart.setLegend(legendArr)
//    lineChart.setList(list)
//}
//
//@Composable
//fun LineGraph(){
//


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LinePreview(){
//    DashBoard()
    Graph()

}















