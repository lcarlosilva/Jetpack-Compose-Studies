package br.com.luiz.jetpack_compose_studies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.luiz.jetpack_compose_studies.chipfilterexamples.single_selection.SingleSelectionScreen
import br.com.luiz.jetpack_compose_studies.MainScreen
import br.com.luiz.jetpack_compose_studies.chipfilterexamples.chip.ChipFilterScreen
import br.com.luiz.jetpack_compose_studies.navigation.Routes.CHIP_FILTER_SCREEN
import br.com.luiz.jetpack_compose_studies.navigation.Routes.MAIN_SCREEN
import br.com.luiz.jetpack_compose_studies.navigation.Routes.SINGLE_SELECTION_SCREEN

@Composable
fun NavGraph(startDestination: String = MAIN_SCREEN) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(route = MAIN_SCREEN) {
            MainScreen(navController = navController)
        }
        composable(route = SINGLE_SELECTION_SCREEN) {
            SingleSelectionScreen {
                navController.popBackStack()
            }
        }
        composable(route = CHIP_FILTER_SCREEN) {
            ChipFilterScreen {
                navController.popBackStack()
            }
        }
    }
}
