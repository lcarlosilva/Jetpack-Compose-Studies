package br.com.luiz.jetpack_compose_studies.chipfilterexamples.single_selection

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.toMutableStateList

class NameItemDataState {
    var nameItemList = mutableStateListOf<NameItemData>()

    fun onItemSelected(selectedItemData: NameItemData) {
        val iterator = nameItemList.listIterator()
        while (iterator.hasNext()) {
            val listItem = iterator.next()
            iterator.set(
                if (listItem.itemId == selectedItemData.itemId) {
                    selectedItemData
                } else {
                    listItem.copy(isSelected = false)
                }
            )
        }
    }

    fun setNameList(nameList: List<NameItemData>) {
        this.nameItemList = nameList.toMutableStateList()
    }
}