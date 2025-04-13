/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.wakfu.model.OgrineToken
 *  org.jetbrains.annotations.Nullable
 *  org.threeten.bp.DateTimeUtils
 *  org.threeten.bp.Instant
 */
import com.ankama.haapi.client.okhttp.wakfu.model.OgrineToken;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import org.threeten.bp.DateTimeUtils;
import org.threeten.bp.Instant;

/*
 * Renamed from bTp
 */
public class btp_1
implements ajh_1 {
    private static final String a = "quantity";
    private static final String b = "kamasPrice";
    private static final String d = "ogrinesQuantity";
    private static final String e = "saleDuration";
    private static final String f = "containsOwnSale";
    private final long g;
    private final long h;
    private final List<OgrineToken> i = new ArrayList<OgrineToken>();

    @Override
    public String[] d() {
        return new String[]{a, b, d, e, f};
    }

    btp_1(OgrineToken ogrineToken) {
        this.g = ogrineToken.getSellingPrice();
        this.h = ogrineToken.getOgrineQuantity();
        this.i.add(ogrineToken);
    }

    Optional<OgrineToken> a() {
        return this.i.stream().min(Comparator.comparing(OgrineToken::getSellingDate));
    }

    public Optional<OgrineToken> b() {
        return this.i.stream().filter(ogrineToken -> ogrineToken.getAccountId().longValue() == azu_0.j().n().u()).min(Comparator.comparing(OgrineToken::getSellingDate));
    }

    void a(OgrineToken ogrineToken) {
        this.i.add(ogrineToken);
    }

    long c() {
        return this.g;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.i.size();
        }
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(d)) {
            return this.h;
        }
        if (string.equals(e)) {
            Optional<OgrineToken> optional = this.a();
            if (optional.isEmpty()) {
                return null;
            }
            Date date = DateTimeUtils.toDate((Instant)optional.get().getSellingDate().toInstant());
            Date date2 = bae.f(date);
            return bae.h().e(date2);
        }
        if (string.equals(f)) {
            return this.i.stream().anyMatch(ogrineToken -> ogrineToken.getAccountId() != null && ogrineToken.getAccountId().longValue() == azu_0.j().n().u());
        }
        return null;
    }
}

