package br.com.luiz.jetpack_compose_studies

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.com.luiz.jetpack_compose_studies.navigation.Routes.SINGLE_SELECTION_SCREEN

@Composable
fun MainScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.padding(top = 60.dp, start = 20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ) {
        Button(
            onClick = {
                navController.navigate(SINGLE_SELECTION_SCREEN)
            },
        ) {
            Text(text = "Single Selection")
        }
    }
}
