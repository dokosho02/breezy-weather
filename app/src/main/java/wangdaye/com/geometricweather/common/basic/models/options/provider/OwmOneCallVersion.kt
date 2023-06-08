package wangdaye.com.geometricweather.common.basic.models.options.provider

import android.content.Context
import wangdaye.com.geometricweather.R
import wangdaye.com.geometricweather.common.basic.models.options._basic.BaseEnum
import wangdaye.com.geometricweather.common.basic.models.options._basic.Utils

enum class OwmOneCallVersion(
    override val id: String
): BaseEnum {

    VERSION_25("2.5"),
    VERSION_30("3.0");

    companion object {

        @JvmStatic
        fun getInstance(
            value: String
        ) = when (value) {
            "2.5" -> VERSION_25
            "3.0" -> VERSION_30
            else -> VERSION_25
        }
    }

    override val valueArrayId = R.array.owm_one_call_version_values
    override val nameArrayId = R.array.owm_one_call_version

    override fun getName(context: Context) = Utils.getName(context, this)
}