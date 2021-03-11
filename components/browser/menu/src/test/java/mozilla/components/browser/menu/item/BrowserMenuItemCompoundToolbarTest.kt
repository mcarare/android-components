/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.components.browser.menu.item

import android.content.Context
import mozilla.components.browser.menu.R
import mozilla.components.support.test.mock
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class BrowserMenuItemCompoundToolbarTest {
    private lateinit var compoundToolbar: BrowserMenuItemCompoundToolbar
    private lateinit var context: Context
    private val startLabel = "Bookmarks"

    @Before
    fun setup() {
        context = mock()
        compoundToolbar = BrowserMenuItemCompoundToolbar(
            startLabelText = startLabel,
            primaryLabelText = "Add",
            secondaryLabelText = "Edit",
            primaryContentDescription = "Add bookmark",
            secondaryContentDescription = "Edit bookmark",
            primaryImageResource = android.R.drawable.star_off,
            secondaryImageResource = android.R.drawable.star_on,
            tintColorResource = android.R.color.holo_purple,
            isInPrimaryState = { true },
            startLabelListener = { },
            endLabelListener = { }
        )
    }

    @Test
    fun `browser compound toolbar uses correct layout`() {
        assertEquals(
            R.layout.mozac_browser_menu_item_compound_toolbar,
            compoundToolbar.getLayoutResource()
        )
    }

    @Test
    fun `browser compound toolbar is visible by default`() {
        Assert.assertTrue(compoundToolbar.visible())
    }
}
