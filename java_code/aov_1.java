/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankama.wakfu.utils.criterion.doc.VarType;
import org.apache.log4j.Logger;

/*
 * Renamed from aoV
 */
public enum aov_1 {
    a(VarType.STRING, new apl_2()),
    b(VarType.NUMBER, new apj_2()),
    c(VarType.BOOLEAN, new apg_2()),
    d(VarType.NUMBERLIST, new aph_2()),
    e(VarType.STRINGLIST, null),
    f(VarType.POSITION, null),
    g(VarType.POSITIONLIST, null),
    h(VarType.PLAYERRANKING, null),
    i(VarType.NUMBERNUMBERMAP, new api_2());

    private static final Logger k;
    public static final aov_1[] j;
    private final VarType l;
    private final apk_2 m;

    private aov_1(VarType varType, apk_2 apk_22) {
        this.l = varType;
        this.m = apk_22;
    }

    public apk_2 a() {
        if (this.m == null) {
            k.error((Object)("Acc\u00e8s \u00e0 un parser non impl\u00e9ment\u00e9 dans ParserType." + this.name()));
        }
        return this.m;
    }

    public static aov_1 a(VarType varType) {
        aov_1[] aov_1Array;
        for (aov_1 aov_12 : aov_1Array = aov_1.values()) {
            if (aov_12.l != varType) continue;
            return aov_12;
        }
        throw new IllegalArgumentException(String.format("No %s value", new Object[]{varType}));
    }

    static {
        k = Logger.getLogger(aov_1.class);
        j = new aov_1[0];
    }
}

