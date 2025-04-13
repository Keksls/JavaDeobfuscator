/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopImage
 *  com.ankama.shopi.client.model.DeviceImage
 *  com.ankama.shopi.client.model.MediaImage
 *  com.ankama.shopi.client.model.MediaOneOf
 *  com.ankama.shopi.client.model.MediaOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.MediaYoutubeVideo
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.ankama.haapi.client.okhttp.ankama.model.ShopImage;
import com.ankama.shopi.client.model.DeviceImage;
import com.ankama.shopi.client.model.MediaImage;
import com.ankama.shopi.client.model.MediaOneOf;
import com.ankama.shopi.client.model.MediaYoutubeVideo;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from bSg
 */
public class bsg_2 {
    private static final Pattern a = Pattern.compile("([0-9]+)_([0-9]+)");
    private static final Logger b = LoggerFactory.getLogger(bsg_2.class);
    private final int c;
    private final int d;
    private final String e;
    @Nullable
    private final Object f;

    private bsg_2(int n, int n2, String string) {
        this(n, n2, string, null);
    }

    private bsg_2(int n, int n2, String string, @Nullable Object object) {
        this.c = n;
        this.d = n2;
        this.e = string;
        this.f = object;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    @Nullable
    public Object d() {
        return this.f;
    }

    public static ArrayList<bsg_2> a(List<ShopImage> list) {
        ArrayList<bsg_2> arrayList = new ArrayList<bsg_2>();
        for (ShopImage shopImage : list) {
            int n = Co.c(shopImage.getWidth());
            int n2 = Co.c(shopImage.getHeight());
            String string = shopImage.getUrl();
            arrayList.add(new bsg_2(n, n2, string));
        }
        return arrayList;
    }

    public static ArrayList<bsg_2> b(List<MediaOneOf> list) {
        ArrayList<bsg_2> arrayList = new ArrayList<bsg_2>();
        block4: for (MediaOneOf mediaOneOf : list) {
            MediaOneOf.DiscriminatorEnum discriminatorEnum = mediaOneOf.getDiscriminator();
            switch (discriminatorEnum) {
                case MEDIAIMAGE: {
                    MediaImage mediaImage = mediaOneOf.getMediaImage();
                    if (mediaImage == null) {
                        b.warn("Missing {} with following discriminator {} in following {}", new Object[]{MediaImage.class, discriminatorEnum, mediaOneOf});
                        continue block4;
                    }
                    arrayList.add(new bsg_2(0, 0, mediaImage.getImage().getUri().toString(), mediaImage.getType()));
                    continue block4;
                }
                case MEDIAYOUTUBEVIDEO: {
                    MediaYoutubeVideo mediaYoutubeVideo = mediaOneOf.getMediaYoutubeVideo();
                    if (mediaYoutubeVideo == null) {
                        b.warn("Missing {} with following discriminator {} in following {}", new Object[]{MediaYoutubeVideo.class, discriminatorEnum, mediaOneOf});
                        continue block4;
                    }
                    arrayList.add(new bsg_2(0, 0, String.format("https://i.ytimg.com/vi_webp/%s/maxresdefault.webp", mediaYoutubeVideo.getId())));
                    continue block4;
                }
            }
            b.warn("Unknown/Unsupported discriminator {} to extract {} from {}", new Object[]{discriminatorEnum, bsg_2.class, mediaOneOf});
        }
        return arrayList;
    }

    public static ArrayList<bsg_2> c(@Nullable List<DeviceImage> list) {
        ArrayList<bsg_2> arrayList = new ArrayList<bsg_2>();
        if (list == null) {
            return arrayList;
        }
        for (DeviceImage deviceImage : list) {
            arrayList.add(new bsg_2(0, 0, deviceImage.getUri().toString(), deviceImage.getDevice()));
        }
        return arrayList;
    }
}

