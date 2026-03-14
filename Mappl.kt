import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class Bollyflix : MainAPI() {

    override var name = "Mappl.tv"
    override var mainUrl = "https://mappl.tv/"
    override var lang = "en"

    override val supportedTypes = setOf(
        TvType.Movie,
        TvType.TvSeries
    )
}