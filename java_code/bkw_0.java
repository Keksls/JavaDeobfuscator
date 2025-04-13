/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from bKw
 */
public class bkw_0
implements ajh_1 {
    private static final Logger m = LoggerFactory.getLogger(bkw_0.class);
    public static final String a = "objectSearchTableModel";
    public static final String b = "onSaleSearchTableModel";
    public static final String d = "currentOffersSearchTableModel";
    public static final String e = "similarEntriesSearchTableModel";
    public static final String f = "similarOffersSearchTableModel";
    public static final String g = "historyTableModel";
    public static final String h = "soldItemsSearchTableModel";
    public static final String i = "expiredEntriesSearchTableModel";
    public static final String j = "expiredOffersSearchTableModel";
    public static final String k = "purchasedItemsSearchTableModel";
    public static final String[] l = new String[]{"objectSearchTableModel", "onSaleSearchTableModel", "currentOffersSearchTableModel", "similarEntriesSearchTableModel", "similarOffersSearchTableModel", "historyTableModel", "soldItemsSearchTableModel", "expiredEntriesSearchTableModel", "expiredOffersSearchTableModel", "purchasedItemsSearchTableModel"};
    private static final bkw_0 n = new bkw_0();
    private final fxu_0 o = bkw_0.a(19496);
    private final fxu_0 p = bkw_0.a(18123);
    private final fxu_0 q = bkw_0.a(16773);
    private final fxu_0 r = bkw_0.a(16683);
    private final fxu_0 s = bkw_0.a(19034);
    private final fxu_0 t = bkw_0.a(16084);
    private final fxu_0 u = bkw_0.a(18786);
    private final fxu_0 v = bkw_0.a(16461);
    private final fxu_0 w = bkw_0.a(16346);
    private final fxu_0 x = bkw_0.a(17046);

    public static bkw_0 a() {
        return n;
    }

    private static fxu_0 a(int n) {
        fxu_0 fxu_02 = new fxu_0();
        fxu_02.a((string, bl) -> {
            faM faM2 = bkw_0.a(string);
            if (faM2 == null) {
                return;
            }
            add_2.b().a(new dgS(faM2, n));
        });
        return fxu_02;
    }

    @Nullable
    private static faM a(String string) {
        faM faM2;
        switch (string) {
            case "name": {
                faM2 = faM.c;
                break;
            }
            case "level": {
                faM2 = faM.h;
                break;
            }
            case "shardsAndElements": 
            case "offerShards": {
                faM2 = faM.f;
                break;
            }
            case "quantity": {
                faM2 = faM.e;
                break;
            }
            case "price": {
                faM2 = faM.d;
                break;
            }
            case "remainingTime": 
            case "date": {
                faM2 = faM.g;
                break;
            }
            default: {
                m.warn("Unknown column name: " + string);
                return null;
            }
        }
        return faM2;
    }

    private bkw_0() {
    }

    @Override
    public String[] d() {
        return l;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "objectSearchTableModel": {
                return this.o;
            }
            case "onSaleSearchTableModel": {
                return this.p;
            }
            case "currentOffersSearchTableModel": {
                return this.q;
            }
            case "similarEntriesSearchTableModel": {
                return this.r;
            }
            case "similarOffersSearchTableModel": {
                return this.s;
            }
            case "historyTableModel": {
                return this.t;
            }
            case "soldItemsSearchTableModel": {
                return this.u;
            }
            case "expiredEntriesSearchTableModel": {
                return this.v;
            }
            case "expiredOffersSearchTableModel": {
                return this.w;
            }
            case "purchasedItemsSearchTableModel": {
                return this.x;
            }
        }
        return null;
    }
}

