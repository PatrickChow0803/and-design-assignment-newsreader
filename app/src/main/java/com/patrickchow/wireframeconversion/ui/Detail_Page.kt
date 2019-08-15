package com.patrickchow.wireframeconversion.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.patrickchow.wireframeconversion.R
import kotlinx.android.synthetic.main.activity_detail__page.*

class Detail_Page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail__page)

        val bundle:Bundle?= intent.extras

        val imageSelection = bundle!!.getInt("key")

        if(imageSelection.toString() == R.drawable.image1.toString()){
            Toast.makeText(this, "Hello1", Toast.LENGTH_SHORT).show()
            image_title.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.image1))
            image_title.layoutParams.width = 2000
            image_title.layoutParams.height = 500
            text_view_details.text = "\n" +
                    "\n" +
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sodales odio at tempus semper. Ut sodales, nisl id scelerisque consequat, nisl metus maximus lectus, ut euismod ipsum metus ac ligula. Nunc consectetur tincidunt semper. Pellentesque semper sollicitudin urna, sed elementum tortor euismod elementum. Nunc at malesuada leo. Mauris vehicula purus ac leo molestie, et blandit mi dignissim. Aliquam erat volutpat. Morbi nec diam sed erat dignissim viverra. Maecenas quis nulla dolor. Vestibulum congue rhoncus enim eget elementum. Aenean porttitor sapien a urna sodales vestibulum. Ut nulla eros, imperdiet non dictum id, sagittis vitae nibh.\n" +
                    "\n" +
                    "Praesent et magna non dui dapibus ultricies. Ut tristique mattis nisi in elementum. Nullam tristique, velit sed mattis tempus, enim nisl mattis ex, sit amet tincidunt elit est a metus. Phasellus pharetra quam sapien, eu faucibus ante accumsan sit amet. Fusce dignissim ligula at nisi pretium, eget eleifend augue blandit. Sed vel vestibulum dui. Cras vel venenatis eros. Vivamus fermentum, nisl vitae accumsan tristique, tortor felis porttitor ipsum, a lacinia elit quam tempor sapien. Curabitur at congue ante, porttitor aliquam nisi. Nullam mauris orci, varius ac metus in, placerat faucibus nulla.\n" +
                    "\n" +
                    "Suspendisse potenti. Cras egestas iaculis laoreet. Donec mollis eros id eros convallis convallis. Donec vitae elit ultricies, ornare tortor sit amet, interdum diam. Cras semper fringilla sodales. Aenean eu accumsan metus. Phasellus ultrices laoreet lorem eu fermentum. Aenean posuere velit sit amet bibendum mattis. Aenean sed tempus sapien. Vivamus maximus pellentesque metus, sit amet volutpat orci porta ut. Duis quis mi eu mauris vehicula suscipit vel quis diam. Fusce egestas, augue et pharetra viverra, erat metus pharetra nisl, non sagittis dui ipsum ut dolor. Fusce urna est, porttitor vel arcu sed, volutpat dictum odio. Vivamus volutpat, libero a efficitur lacinia, magna quam consectetur nisl, id laoreet nisi enim eu sem. Phasellus non lorem nulla.\n" +
                    "\n" +
                    "Nam tincidunt, mauris sit amet venenatis fermentum, lorem massa blandit quam, ut hendrerit ante mi vulputate turpis. Donec in aliquet velit, quis rutrum lorem. Donec consectetur dignissim ex nec faucibus. Pellentesque quis felis nec nunc sollicitudin tristique eu non risus. Quisque purus tortor, lacinia non odio nec, euismod rhoncus dui. Nunc sit amet felis eleifend, cursus arcu ut, tincidunt sapien. Pellentesque laoreet turpis at mi lacinia porttitor. Pellentesque justo nisl, sagittis sed ultricies non, lacinia ut dui.\n" +
                    "\n" +
                    "Proin pretium urna quam. Donec ante justo, elementum sit amet cursus at, porttitor sit amet felis. Aliquam erat volutpat. Mauris vitae libero tristique, imperdiet diam ac, eleifend lectus. In hac habitasse platea dictumst. Aenean dapibus ex et lacus porta, a egestas urna efficitur. Ut eget malesuada augue, id cursus ante. Nullam pretium tempus mauris vitae molestie. Nulla erat nibh, tincidunt non venenatis vitae, facilisis nec lorem. Aenean quis volutpat sapien. Ut sed velit eu lacus lobortis ultricies vitae in leo. Proin dignissim sodales efficitur. "
        }
        else if(imageSelection.toString() == R.drawable.image2.toString()){
            Toast.makeText(this, "Hello2", Toast.LENGTH_SHORT).show()
            image_title.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.image2))
            image_title.layoutParams.width = 2000
            image_title.layoutParams.height = 500
            text_view_details.text = "\n" +
                    "\n" +
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec diam diam, tempor et malesuada ac, tempor ac sapien. Fusce eu ex a lectus ultrices accumsan id et orci. Nunc at mi ullamcorper, vestibulum justo in, consequat nulla. Fusce quis faucibus turpis, sit amet commodo enim. Vivamus diam tortor, vehicula at iaculis nec, euismod rutrum justo. Cras eget nisl a augue sagittis hendrerit nec eu lacus. In vitae ligula et lacus maximus volutpat eget vitae felis. Maecenas sem sem, tempor ac nunc quis, tempus imperdiet risus. Maecenas porta, enim vitae porta porta, velit leo gravida nisi, ac mollis nibh nisl cursus nisi. Integer velit nunc, elementum id dapibus id, maximus vitae ipsum. Aenean mattis lectus sit amet massa tincidunt, ut venenatis tortor pulvinar. Curabitur quis ante urna. Nulla facilisi. Nullam ligula arcu, vestibulum vitae dolor a, lobortis bibendum lectus. Quisque quis lacus arcu. Quisque condimentum ultrices congue.\n" +
                    "\n" +
                    "Donec vulputate metus a nibh lobortis rhoncus. Etiam mollis viverra augue, eu bibendum tortor consectetur at. Donec consectetur leo consequat libero porta, quis accumsan nunc imperdiet. Nam vehicula velit vitae tellus interdum facilisis. Vestibulum massa erat, accumsan id efficitur nec, tincidunt at felis. Mauris eu neque vel tortor commodo tempus id at massa. Donec sed magna vitae nisl faucibus tristique. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras rutrum venenatis sem eget interdum. Sed placerat pellentesque aliquam. Cras at rutrum ligula. Phasellus tincidunt, tellus ut vehicula consequat, tellus est vulputate eros, quis mattis neque urna et enim. Aenean metus nibh, pharetra in fermentum in, sodales sit amet massa. In hac habitasse platea dictumst. Sed mattis et nunc eget efficitur.\n" +
                    "\n" +
                    "Vivamus et magna porttitor tellus placerat tristique. In dictum, dui eget tempor scelerisque, nisl enim volutpat velit, hendrerit dignissim nisl sapien et nunc. Integer vitae nibh nec ex venenatis iaculis eu sit amet nunc. Donec dolor justo, ultricies non mollis nec, pulvinar sollicitudin erat. Donec feugiat faucibus posuere. Sed sed tellus nec urna facilisis consequat vitae sed arcu. Sed tortor neque, laoreet sed quam nec, posuere sagittis leo. Sed euismod consectetur ornare. Sed maximus hendrerit urna, eget tempor lacus efficitur ut. In hac habitasse platea dictumst. Mauris commodo nibh id turpis mattis iaculis.\n" +
                    "\n" +
                    "Sed sed dapibus massa, vitae pellentesque urna. Integer fringilla ullamcorper mauris non aliquam. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Mauris scelerisque quis mi vel auctor. Curabitur non magna nulla. Phasellus convallis vulputate facilisis. Ut consequat eros a luctus malesuada.\n" +
                    "\n" +
                    "Phasellus lacinia turpis in malesuada rutrum. Duis non orci fringilla, feugiat mi et, vulputate ligula. Cras a tempus justo, nec iaculis ligula. Aenean cursus blandit leo, a elementum lacus. Etiam consequat id arcu sit amet commodo. Vivamus lobortis est sit amet quam molestie sollicitudin. Nam ac facilisis nulla. Vivamus imperdiet posuere feugiat. Nunc venenatis metus ex, eget accumsan dolor blandit sit amet. Fusce est ligula, accumsan eget lorem non, ultricies finibus urna. Maecenas imperdiet faucibus nibh, pulvinar finibus est. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis sit amet molestie risus. Interdum et malesuada fames ac ante ipsum primis in faucibus. "
        }
        else if(imageSelection.toString() == R.drawable.image3.toString()){
            Toast.makeText(this, "Hello3", Toast.LENGTH_SHORT).show()
            image_title.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.image3))
            image_title.layoutParams.width = 2000
            image_title.layoutParams.height = 500
            text_view_details.text = "\n" +
                    "\n" +
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed egestas vestibulum ante. Maecenas ut risus id arcu laoreet pretium. Sed blandit varius orci, ac volutpat enim pretium in. Curabitur ut ex et lorem euismod ornare a a nunc. Nulla eu cursus erat, et pellentesque diam. Vivamus laoreet non nisl nec fringilla. Sed venenatis auctor convallis.\n" +
                    "\n" +
                    "Vivamus fringilla neque a nulla commodo ultrices. Praesent volutpat dolor non ultrices sagittis. Quisque rutrum, nibh eu feugiat hendrerit, orci urna semper nibh, in egestas mauris metus id augue. Aenean nulla tellus, iaculis non faucibus ut, hendrerit eget massa. Sed pellentesque orci vel lorem faucibus placerat. In maximus ipsum nec tortor pellentesque posuere. Donec sed elit volutpat, ullamcorper ligula quis, tempus nibh. Morbi ut tincidunt quam. Quisque eu ultricies ipsum.\n" +
                    "\n" +
                    "Nulla cursus diam sed elit tincidunt consequat. Maecenas semper a dolor sed fringilla. In hac habitasse platea dictumst. Integer ac quam quis magna vestibulum hendrerit. Proin pellentesque leo finibus erat porttitor sodales ut ac velit. Nam euismod nisl at justo finibus, non luctus nisi volutpat. Ut sit amet magna pharetra, tempus eros nec, consectetur neque.\n" +
                    "\n" +
                    "Donec semper est sit amet ex vestibulum, et tempor nulla vehicula. Nam malesuada ipsum ac lorem pellentesque efficitur. Vivamus sed lacus non nunc congue blandit at id massa. Mauris ut metus et enim euismod porta eu sed arcu. Nam laoreet, diam vitae dapibus lobortis, magna justo fermentum ligula, eu mattis ipsum lacus et ex. Nunc rutrum consequat erat, nec semper sapien mattis pulvinar. Nunc pellentesque semper ante ac porttitor. Suspendisse a libero dui. Proin ultrices luctus quam eget pharetra. Donec fringilla sem ut facilisis gravida.\n" +
                    "\n" +
                    "Ut lorem justo, ullamcorper sed aliquet eu, accumsan sit amet orci. Sed a euismod mi. Etiam lorem nibh, euismod ut dui sed, efficitur varius nisi. Praesent porttitor congue odio. Sed felis felis, accumsan a sem at, laoreet gravida enim. Curabitur lobortis ex sit amet dolor efficitur pretium. Aenean enim odio, luctus a augue non, sodales lobortis massa. Sed placerat faucibus arcu a luctus. "
        }
        else if(imageSelection.toString() == R.drawable.image4.toString()){
            Toast.makeText(this, "Hello4", Toast.LENGTH_SHORT).show()
            image_title.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.image4))
            image_title.layoutParams.width = 2000
            image_title.layoutParams.height = 500
            text_view_details.text = "\n" +
                    "\n" +
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vel lectus egestas, lacinia arcu at, condimentum sem. Fusce finibus nibh tempor, semper nulla eu, feugiat ante. Morbi ut mi purus. Curabitur mattis gravida risus, eget imperdiet magna sagittis et. Morbi felis eros, bibendum sed nisl eu, maximus rutrum felis. Etiam luctus, sapien a auctor lacinia, libero massa sodales purus, vitae efficitur nisi nibh quis lorem. Proin ut condimentum mi. Sed iaculis nulla libero, nec ultricies metus finibus feugiat. Integer feugiat quis tellus id cursus. Nullam dapibus eget lectus sed dignissim. Sed varius tincidunt libero, a suscipit libero.\n" +
                    "\n" +
                    "Ut leo orci, rutrum vel semper a, interdum blandit neque. Vivamus finibus ligula felis, sed eleifend libero accumsan at. Nulla tincidunt massa nec nisl malesuada, eget facilisis lorem tempor. Nam volutpat libero eget orci semper aliquam. Fusce sit amet eros at felis pulvinar porttitor ut vel dui. Mauris nulla ipsum, iaculis et ligula eu, ultricies laoreet tortor. Pellentesque quis odio eros. Integer imperdiet, orci a laoreet imperdiet, quam augue sodales mi, ut malesuada massa sapien quis ligula. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed eget quam ornare, gravida massa id, accumsan nunc.\n" +
                    "\n" +
                    "Vivamus ac sollicitudin est. Suspendisse potenti. Aenean tristique hendrerit nunc non convallis. Aenean porta ultricies tincidunt. Nunc vehicula risus pulvinar sem dignissim, a eleifend velit porttitor. Pellentesque condimentum posuere ullamcorper. Sed in leo facilisis, dictum libero malesuada, pretium magna. Sed blandit sem eget luctus consequat. Vestibulum tincidunt fringilla nunc in facilisis. In ultricies mattis viverra.\n" +
                    "\n" +
                    "Phasellus ac tempus odio. Etiam porttitor, ipsum ac dignissim sagittis, nibh ipsum ultricies erat, nec pulvinar elit neque in eros. Suspendisse tincidunt, justo ac dapibus posuere, lacus libero semper tellus, sit amet egestas arcu nisi ac magna. Sed sit amet ligula sed sapien porta aliquet. Curabitur vel lacus sit amet ante mollis suscipit ut laoreet nunc. Sed id mauris nunc. Duis placerat sapien eu hendrerit hendrerit. Pellentesque fringilla tincidunt neque, vitae semper nunc posuere sed. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Maecenas at eros ac elit consectetur porta vel non felis. Vivamus fermentum vestibulum eros ut dictum. Donec facilisis sollicitudin lacus. Curabitur sit amet nisi porta, maximus ligula et, pretium tortor.\n" +
                    "\n" +
                    "Nulla vel mattis lorem. Donec vitae massa varius, sollicitudin felis vitae, suscipit sapien. Aliquam faucibus ut eros in mattis. Proin turpis odio, ultrices ut magna sagittis, mattis imperdiet nulla. Sed quam mauris, condimentum eget sapien non, consequat interdum sem. Morbi quis est tristique, auctor metus vel, accumsan felis. Sed mattis ex eu sem tincidunt, non maximus purus dapibus. Cras iaculis porta libero, vitae venenatis odio fermentum vel. Aliquam volutpat ultricies augue vitae sodales. Morbi ac erat sit amet enim rutrum sollicitudin in non diam. Pellentesque facilisis sollicitudin sem sit amet hendrerit. Sed ullamcorper malesuada quam quis rutrum. Cras eget condimentum ante. "
        }
        else if(imageSelection.toString() == R.drawable.image5.toString()){
            Toast.makeText(this, "Hello5", Toast.LENGTH_SHORT).show()
            image_title.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.image5))
            image_title.layoutParams.width = 2000
            image_title.layoutParams.height = 500
            text_view_details.text = "\n" +
                    "\n" +
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur vitae enim eu velit venenatis luctus. Nam pulvinar arcu quis diam tempus malesuada. Sed lacinia enim eu finibus ullamcorper. Aenean ultricies sapien vel mattis ultrices. Mauris vitae erat tristique, porttitor dolor ut, porta eros. Proin ante velit, mollis sed quam nec, facilisis blandit ligula. Integer vehicula eu purus eget porttitor. Vivamus laoreet porta rutrum. Suspendisse id odio ullamcorper quam hendrerit fringilla rhoncus nec neque. Pellentesque lacinia viverra euismod. Praesent posuere sapien in dignissim elementum.\n" +
                    "\n" +
                    "Curabitur lectus turpis, vestibulum quis arcu sed, bibendum faucibus augue. Cras quis est finibus, auctor dui eu, dictum nibh. Mauris scelerisque metus libero, at porttitor libero dapibus a. Etiam in felis pharetra, scelerisque lectus quis, efficitur tellus. Donec at ante consequat, convallis dolor et, porttitor nunc. Cras tincidunt aliquet semper. Fusce malesuada odio orci, quis tempus velit ornare sed. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sollicitudin mollis arcu non feugiat. Nunc tristique, tellus iaculis congue scelerisque, diam tellus posuere orci, et finibus lorem nibh a quam. Aenean vitae elementum felis, at sollicitudin tellus.\n" +
                    "\n" +
                    "Sed sit amet auctor urna. Nam a dapibus nibh. Nam purus lectus, pulvinar quis maximus mollis, feugiat nec tortor. Pellentesque vitae vehicula mauris. Nunc ipsum tortor, cursus eget dolor vel, rhoncus lobortis nisl. Fusce eget enim bibendum, elementum est ut, eleifend ante. Donec faucibus neque nec metus finibus, vitae luctus dolor cursus. Pellentesque viverra turpis nisi. Pellentesque eget tellus finibus, egestas quam quis, finibus elit. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla in rhoncus nunc, at cursus nunc.\n" +
                    "\n" +
                    "Duis scelerisque mollis ante eget efficitur. Vestibulum id dapibus odio. Praesent placerat aliquam magna in mattis. Sed viverra dolor a orci congue, sed consequat tellus vestibulum. Maecenas tempus mi felis, id tempus arcu suscipit a. Sed blandit sollicitudin lacus, at scelerisque magna vulputate quis. Sed vehicula ex sit amet mollis consequat. Aenean efficitur mauris pellentesque dapibus lacinia. Praesent elementum eros est, in ullamcorper turpis egestas et.\n" +
                    "\n" +
                    "Cras vestibulum rhoncus pharetra. Donec placerat eros orci, ut tincidunt sem pretium eget. Vestibulum ligula dui, pretium nec odio ut, ultricies euismod velit. Vestibulum et nisl at lorem venenatis luctus non ut nunc. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nunc sed pulvinar sem. Cras sollicitudin erat sit amet leo pellentesque, vitae vestibulum neque pretium. Morbi nibh arcu, condimentum eu sodales eu, molestie eu lacus. Suspendisse sed sapien et felis mattis volutpat ac sed libero. Phasellus tempus diam nec ex sagittis commodo. Duis vel lorem et nunc condimentum viverra ac eget lorem. Suspendisse pharetra metus dolor, quis aliquam enim posuere in. "
        }
    }
}
