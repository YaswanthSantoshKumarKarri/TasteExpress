import React from 'react'
import { Line } from 'react-chartjs-2'
import {
  Chart as ChartJS,
  CategoryScale,
  LinearScale,
  PointElement,
  LineElement,
  Title,
  Tooltip,
  Legend
} from 'chart.js'

ChartJS.register(
  CategoryScale,
  LinearScale,
  PointElement,
  LineElement,
  Title,
  Tooltip,
  Legend
)

const LineGraph = ({ lineChartData,widthValue,heightValue }) => {
  const options = {
    responsive: true,
    maintainAspectRatio: false
  }

  return (
    <div style={{ width: widthValue, height: heightValue }}>
      <Line options={options} data={lineChartData} />
    </div>
  )
}

export default LineGraph
