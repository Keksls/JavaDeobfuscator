/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
 * Renamed from fz
 */
public final class fz_1
extends GeneratedMessageV3
implements fe_2 {
    private static final long f = 0L;
    public static final int a = 1;
    List<fk_2> g;
    public static final int b = 2;
    MapField<Long, fk_2> h;
    public static final int c = 3;
    List<Integer> i;
    private int j = -1;
    public static final int d = 4;
    MapField<Long, fv_2> k;
    private byte l = (byte)-1;
    private static final fz_1 m = new fz_1();
    @Deprecated
    public static final Parser<fz_1> e = new fa_2();

    fz_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fz_1() {
        this.g = Collections.emptyList();
        this.i = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fz_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block14: while (!bl) {
                MapEntry mapEntry;
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block14;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block14;
                        bl = true;
                        continue block14;
                    }
                    case 10: {
                        if ((n & 1) != 1) {
                            this.g = new ArrayList<fk_2>();
                            n |= 1;
                        }
                        this.g.add((fk_2)codedInputStream.readMessage(fk_2.d, extensionRegistryLite));
                        continue block14;
                    }
                    case 18: {
                        if ((n & 2) != 2) {
                            this.h = MapField.newMapField(fd_2.a);
                            n |= 2;
                        }
                        mapEntry = (MapEntry)codedInputStream.readMessage(fd_2.a.getParserForType(), extensionRegistryLite);
                        this.h.getMutableMap().put((Long)mapEntry.getKey(), (fk_2)mapEntry.getValue());
                        continue block14;
                    }
                    case 24: {
                        if ((n & 4) != 4) {
                            this.i = new ArrayList<Integer>();
                            n |= 4;
                        }
                        this.i.add(codedInputStream.readInt32());
                        continue block14;
                    }
                    case 26: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.i = new ArrayList<Integer>();
                            n |= 4;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.i.add(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n4);
                        continue block14;
                    }
                    case 34: 
                }
                if ((n & 8) != 8) {
                    this.k = MapField.newMapField(fb_2.a);
                    n |= 8;
                }
                mapEntry = (MapEntry)codedInputStream.readMessage(fb_2.a.getParserForType(), extensionRegistryLite);
                this.k.getMutableMap().put((Long)mapEntry.getKey(), (fv_2)mapEntry.getValue());
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (n & true) {
                this.g = Collections.unmodifiableList(this.g);
            }
            if ((n & 4) == 4) {
                this.i = Collections.unmodifiableList(this.i);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return fr_1.e;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.u();
            }
            case 4: {
                return this.v();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fr_1.f.ensureFieldAccessorsInitialized(fz_1.class, fc_2.class);
    }

    @Override
    public List<fk_2> b() {
        return this.g;
    }

    @Override
    public List<? extends fn_2> c() {
        return this.g;
    }

    @Override
    public int d() {
        return this.g.size();
    }

    @Override
    public fk_2 a(int n) {
        return this.g.get(n);
    }

    @Override
    public fn_2 b(int n) {
        return this.g.get(n);
    }

    MapField<Long, fk_2> u() {
        if (this.h == null) {
            return MapField.emptyMapField(fd_2.a);
        }
        return this.h;
    }

    @Override
    @Deprecated
    public int e() {
        return this.u().getMap().size();
    }

    @Override
    @Deprecated
    public boolean a(long l) {
        return this.u().getMap().containsKey(l);
    }

    @Override
    @Deprecated
    public Map<Long, fk_2> f() {
        return this.g();
    }

    @Override
    @Deprecated
    public Map<Long, fk_2> g() {
        return this.u().getMap();
    }

    @Override
    @Deprecated
    public fk_2 a(long l, fk_2 fk_22) {
        Map map = this.u().getMap();
        return map.containsKey(l) ? (fk_2)map.get(l) : fk_22;
    }

    @Override
    @Deprecated
    public fk_2 b(long l) {
        Map map = this.u().getMap();
        if (!map.containsKey(l)) {
            throw new IllegalArgumentException();
        }
        return (fk_2)map.get(l);
    }

    @Override
    public List<Integer> h() {
        return this.i;
    }

    @Override
    public int i() {
        return this.i.size();
    }

    @Override
    public int c(int n) {
        return this.i.get(n);
    }

    MapField<Long, fv_2> v() {
        if (this.k == null) {
            return MapField.emptyMapField(fb_2.a);
        }
        return this.k;
    }

    @Override
    public int j() {
        return this.v().getMap().size();
    }

    @Override
    public boolean c(long l) {
        return this.v().getMap().containsKey(l);
    }

    @Override
    @Deprecated
    public Map<Long, fv_2> k() {
        return this.l();
    }

    @Override
    public Map<Long, fv_2> l() {
        return this.v().getMap();
    }

    @Override
    public fv_2 a(long l, fv_2 fv_22) {
        Map map = this.v().getMap();
        return map.containsKey(l) ? (fv_2)map.get(l) : fv_22;
    }

    @Override
    public fv_2 d(long l) {
        Map map = this.v().getMap();
        if (!map.containsKey(l)) {
            throw new IllegalArgumentException();
        }
        return (fv_2)map.get(l);
    }

    public final boolean isInitialized() {
        byte by = this.l;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.l = 0;
            return false;
        }
        for (fk_2 generatedMessageV3 : this.g().values()) {
            if (generatedMessageV3.isInitialized()) continue;
            this.l = 0;
            return false;
        }
        for (fv_2 fv_22 : this.l().values()) {
            if (fv_22.isInitialized()) continue;
            this.l = 0;
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        this.getSerializedSize();
        for (n = 0; n < this.g.size(); ++n) {
            codedOutputStream.writeMessage(1, (MessageLite)this.g.get(n));
        }
        GeneratedMessageV3.serializeLongMapTo((CodedOutputStream)codedOutputStream, this.u(), fd_2.a, (int)2);
        if (this.h().size() > 0) {
            codedOutputStream.writeUInt32NoTag(26);
            codedOutputStream.writeUInt32NoTag(this.j);
        }
        for (n = 0; n < this.i.size(); ++n) {
            codedOutputStream.writeInt32NoTag(this.i.get(n).intValue());
        }
        GeneratedMessageV3.serializeLongMapTo((CodedOutputStream)codedOutputStream, this.v(), fb_2.a, (int)4);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        MapEntry mapEntry;
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int k = 0; k < this.g.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.g.get(k)));
        }
        for (Map.Entry entry : this.u().getMap().entrySet()) {
            mapEntry = fd_2.a.newBuilderForType().setKey((Object)((Long)entry.getKey())).setValue((Object)((fk_2)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)mapEntry);
        }
        int n2 = 0;
        for (int k = 0; k < this.i.size(); ++k) {
            n2 += CodedOutputStream.computeInt32SizeNoTag((int)this.i.get(k));
        }
        n += n2;
        if (!this.h().isEmpty()) {
            ++n;
            n += CodedOutputStream.computeInt32SizeNoTag((int)n2);
        }
        this.j = n2;
        for (Map.Entry entry : this.v().getMap().entrySet()) {
            mapEntry = fb_2.a.newBuilderForType().setKey((Object)((Long)entry.getKey())).setValue((Object)((fv_2)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)4, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fz_1)) {
            return super.equals(object);
        }
        fz_1 fz_12 = (fz_1)object;
        boolean bl = true;
        bl = bl && this.b().equals(fz_12.b());
        bl = bl && this.u().equals(fz_12.u());
        bl = bl && this.h().equals(fz_12.h());
        bl = bl && this.v().equals(fz_12.v());
        bl = bl && this.unknownFields.equals((Object)fz_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fz_1.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        if (!this.u().getMap().isEmpty()) {
            n = 37 * n + 2;
            n = 53 * n + this.u().hashCode();
        }
        if (this.i() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.h().hashCode();
        }
        if (!this.v().getMap().isEmpty()) {
            n = 37 * n + 4;
            n = 53 * n + this.v().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fz_1 a(ByteBuffer byteBuffer) {
        return (fz_1)e.parseFrom(byteBuffer);
    }

    public static fz_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_1)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fz_1 a(ByteString byteString) {
        return (fz_1)e.parseFrom(byteString);
    }

    public static fz_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_1)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static fz_1 a(byte[] byArray) {
        return (fz_1)e.parseFrom(byArray);
    }

    public static fz_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_1)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static fz_1 a(InputStream inputStream) {
        return (fz_1)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static fz_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_1)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fz_1 b(InputStream inputStream) {
        return (fz_1)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static fz_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_1)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fz_1 a(CodedInputStream codedInputStream) {
        return (fz_1)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static fz_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_1)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fc_2 m() {
        return fz_1.n();
    }

    public static fc_2 n() {
        return m.o();
    }

    public static fc_2 a(fz_1 fz_12) {
        return m.o().a(fz_12);
    }

    public fc_2 o() {
        return this == m ? new fc_2() : new fc_2().a(this);
    }

    protected fc_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        fc_2 fc_22 = new fc_2(builderParent);
        return fc_22;
    }

    public static fz_1 p() {
        return m;
    }

    public static Parser<fz_1> q() {
        return e;
    }

    public Parser<fz_1> getParserForType() {
        return e;
    }

    public fz_1 r() {
        return m;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.r();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.r();
    }

    static /* synthetic */ boolean s() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean t() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fz_1 fz_12) {
        return fz_12.unknownFields;
    }
}

