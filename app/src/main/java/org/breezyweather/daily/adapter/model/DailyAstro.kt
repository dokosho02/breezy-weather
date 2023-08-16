/**
 * This file is part of Breezy Weather.
 *
 * Breezy Weather is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, version 3 of the License.
 *
 * Breezy Weather is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Breezy Weather. If not, see <https://www.gnu.org/licenses/>.
 */

package org.breezyweather.daily.adapter.model

import org.breezyweather.common.basic.models.weather.Astro
import org.breezyweather.common.basic.models.weather.MoonPhase
import org.breezyweather.daily.adapter.DailyWeatherAdapter
import java.util.*

class DailyAstro(
    val timeZone: TimeZone,
    val sun: Astro?,
    val moon: Astro?,
    val moonPhase: MoonPhase?
) : DailyWeatherAdapter.ViewModel {
    override val code = 7

    companion object {
        fun isCode(code: Int) = (code == 7)
    }
}
