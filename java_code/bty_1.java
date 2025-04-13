/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopArticle
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopCategory
 *  javax.annotation.Nullable
 *  org.jetbrains.annotations.NotNull
 *  org.threeten.bp.DateTimeUtils
 *  org.threeten.bp.Instant
 *  org.threeten.bp.OffsetDateTime
 *  org.threeten.bp.ZoneId
 */
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticle;
import com.ankama.haapi.client.okhttp.ankama.model.ShopCategory;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
import org.threeten.bp.DateTimeUtils;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

/*
 * Renamed from bTy
 */
public final class bty_1 {
    public static List<bss_0<?, ?>> a(List<ShopArticle> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return list.stream().map(bsp_2::a).filter(Objects::nonNull).filter(bss_0::o).collect(Collectors.toList());
    }

    public static List<bSt<?>> b(List<ShopCategory> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return list.stream().map(bty_1::a).filter(Objects::nonNull).collect(Collectors.toList());
    }

    private static bsb_0 a(@NotNull ShopCategory shopCategory) {
        bsb_0 bsb_02 = new bsb_0(Hw.e(shopCategory.getId()), shopCategory.getName(), shopCategory.getDescription(), shopCategory.getUrl(), bSu.a(shopCategory.getDisplaymode()), shopCategory.getKey());
        if (!bsp_2.a(bsb_02)) {
            return null;
        }
        List list = shopCategory.getChild();
        if (list == null) {
            return bsb_02;
        }
        list.stream().map(bty_1::a).filter(Objects::nonNull).forEach(bsb_02::a);
        return bsb_02;
    }

    public static OffsetDateTime a(@Nullable Date date) {
        if (date == null) {
            return null;
        }
        return OffsetDateTime.ofInstant((Instant)DateTimeUtils.toInstant((Date)date), (ZoneId)ZoneId.systemDefault());
    }

    public static wt_0 a(@Nullable OffsetDateTime offsetDateTime) {
        if (offsetDateTime == null) {
            return wt_0.b();
        }
        return new wt_0(offsetDateTime.getSecond(), offsetDateTime.getMinute(), offsetDateTime.getHour(), offsetDateTime.getDayOfMonth(), offsetDateTime.getMonthValue(), offsetDateTime.getYear());
    }
}

