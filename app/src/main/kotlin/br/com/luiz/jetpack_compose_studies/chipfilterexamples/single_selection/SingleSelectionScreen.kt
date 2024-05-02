package br.com.luiz.jetpack_compose_studies.chipfilterexamples.single_selection

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SingleSelectionScreen(navigateBack: () -> Unit) {
    SingleSelectionItem(modifier = Modifier.padding(vertical = 70.dp))
}
