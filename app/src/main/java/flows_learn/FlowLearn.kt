package flows_learn

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

private val TAG = "Kotlin_Flow"

class FlowLearn : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        runBlocking {
            getDataFlow().collect {data->
                Log.d(TAG, "main: $data")
            }
        }

    }

}





fun getDataFlow() : Flow<String> {
  return flow {
      emit("Start Loading ..")
      delay(1000)

      emit("Get Data ..")
      delay(500)

      emit("Filter Data")
      delay(1000)

      emit("Data is ready ...")
      delay(2000)

      emit("Stop Loading")
  }
}