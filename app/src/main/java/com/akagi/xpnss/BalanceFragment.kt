package com.akagi.xpnss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.anychart.AnyChartView
import com.akagi.xpnss.PieChart

class BalanceFragment : Fragment(R.layout.fragment_balance) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val pieView: AnyChartView = view.findViewById<AnyChartView>(R.id.pieView)
        val chart = PieChart()
    }
}