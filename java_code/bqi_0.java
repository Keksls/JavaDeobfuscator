/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from bQI
 */
public enum bqi_0 {
    a(0, null),
    b(7, "error.connection.unknown"),
    c(5, "error.connection.banned"),
    d(8, "error.connection.account.locked"),
    e(22, "error.connection.OTPAuthFailed"),
    f(2, "error.connection.invalidLogin"),
    g(3, "error.connection.alreadyConnected"),
    h(12, "error.connection.invalidPartner"),
    i(20, "error.connection.invalidEmail"),
    j(25, "error.connection.forbiddenCommunity"),
    k(23, "error.connection.external.accountLinked"),
    l(24, "error.connection.external.noAccount"),
    m(44, "error.connection.reset.password"),
    n(125, "steam.error.account.link"),
    o(126, "steam.error.account.no.certify"),
    p(124, "anonymous.ip.forbidden");

    private static final Logger s;
    public final byte q;
    public final String r;

    private bqi_0(byte by, String string2) {
        this.q = by;
        this.r = string2;
    }

    public static bqi_0 a(byte by) {
        for (bqi_0 bqi_02 : bqi_0.values()) {
            if (bqi_02.q != by) continue;
            return bqi_02;
        }
        s.warn(String.format("No %s found with following code : %s (Return %s as fallback)", new Object[]{bqi_0.class, by, b}));
        return b;
    }

    static {
        s = LoggerFactory.getLogger(bqi_0.class);
    }
}

