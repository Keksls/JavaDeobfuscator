/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Renamed from aJk
 */
public class ajk_1 {
    private static final int b = 900;
    private final Map<String, ais_2> c = new HashMap<String, ais_2>();
    private final Set<String> d = new HashSet<String>();
    private final Map<String, HashSet<ajc_2>> e = new HashMap<String, HashSet<ajc_2>>();
    protected static final Logger a = Logger.getLogger("com.ankamagames.framework.net.torrent.Tracker");

    public ajk_1(HashSet<String> hashSet) {
        for (String string : hashSet) {
            this.d.add(string);
            this.e.put(string, new HashSet());
        }
    }

    public ajk_1(ais_2 ais_22) {
        String string = ais_22.c();
        this.d.add(string);
        this.c.put(string, ais_22);
        this.e.put(string, new HashSet());
    }

    public ais_2 a(String string) {
        return this.c.get(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string, ajc_2 ajc_22) {
        HashSet<ajc_2> hashSet = this.e.get(string);
        if (hashSet != null) {
            HashSet<ajc_2> hashSet2 = hashSet;
            synchronized (hashSet2) {
                hashSet.add(ajc_22);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public byte[] a(InetAddress inetAddress, int n, Map map) {
        Set set;
        int n2;
        String string3;
        a.log(Level.FINE, "TrackerReq " + inetAddress + ":" + n + " -> " + map);
        String string2 = (String)map.get("info_hash");
        if (string2 == null) {
            return ajk_1.c("No info_hash given");
        }
        string2 = string2.replace("%", "");
        boolean bl = false;
        for (String string3 : this.d) {
            if (!string3.equals(string2)) continue;
            bl = true;
        }
        if (!bl) {
            return ajk_1.c("Tracker doesn't handle given info_hash");
        }
        string3 = (String)map.get("peer_id");
        if (string3 == null) {
            return ajk_1.c("No peer_id given");
        }
        Object object = ajk_1.b(string3);
        if (((Object)object).length != 20) {
            return ajk_1.c("peer_id must be 20 bytes long");
        }
        String string4 = (String)map.get("port");
        if (string4 == null) {
            return ajk_1.c("No port given");
        }
        try {
            n2 = Integer.parseInt(string4);
        }
        catch (NumberFormatException numberFormatException) {
            return ajk_1.c("port not a number: " + numberFormatException);
        }
        ajc_2 ajc_22 = new ajc_2((byte[])object, inetAddress, n2);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Set set2 = set = (Set)this.e.get(string2);
        synchronized (set2) {
            String string5 = (String)map.get("event");
            if ("stopped".equals(string5)) {
                set.remove(ajc_22);
            } else {
                set.add(ajc_22);
            }
            hashMap.put("interval", 900);
            ArrayList arrayList = new ArrayList();
            for (ajc_2 ajc_23 : set) {
                HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
                hashMap2.put("peer id", ajc_23.a());
                hashMap2.put("ip", ajc_23.b().getHostAddress());
                hashMap2.put("port", ajc_23.c());
                arrayList.add(hashMap2);
            }
            hashMap.put("peers", arrayList);
        }
        a.log(Level.FINE, "Tracker response: " + hashMap);
        return ajp_1.a(hashMap);
    }

    private static byte[] c(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("failure reason", string);
        return ajp_1.a(hashMap);
    }

    static byte[] b(String string) {
        string = string.replace('+', ' ');
        char[] cArray = string.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n = 0;
        while (n < cArray.length) {
            if (cArray[n] != '%') {
                byteArrayOutputStream.write((byte)cArray[n]);
                ++n;
                continue;
            }
            if (n + 2 < cArray.length) {
                int n2 = 16 * Character.digit(cArray[n + 1], 16) + Character.digit(cArray[n + 2], 16);
                byteArrayOutputStream.write((byte)n2);
                n += 3;
                continue;
            }
            ++n;
        }
        return byteArrayOutputStream.toByteArray();
    }
}

