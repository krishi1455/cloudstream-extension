import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class Bollyflix : MainAPI() {

    override var name = "Bollyflix"
    override var mainUrl = "https://bollyflix.sarl"
    override var lang = "en"

    override val supportedTypes = setOf(
        TvType.Movie,
        TvType.TvSeries
    )
}
