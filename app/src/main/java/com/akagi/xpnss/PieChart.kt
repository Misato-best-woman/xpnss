package com.akagi.xpnss
import com.anychart.AnyChart
import com.anychart.AnyChartView
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.charts.Pie

class PieChart {
    fun makePie(view: AnyChartView, categories: List<String>, expenses: List<Float>){
        val pie: Pie = AnyChart.pie()
        val dataEntry: List<DataEntry> = arrayListOf()

        /*
        * Must create a way of giving the dataEntry a list of expenses that does not necessarily
        * has to be the same length as the categories list.
        * Maybe a while?
        * while(expenses[i].category == categories[i]... WHAT???
        * I think a double for with a while
         */

        //pie.data()
        view.setChart(pie)
    }
}