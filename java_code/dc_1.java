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
import java.util.Map;

/*
 * Renamed from dC
 */
public final class dc_1
extends GeneratedMessageV3
implements dg_1 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    MapField<Integer, dp_2> g;
    public static final int b = 2;
    di_1 h;
    public static final int c = 3;
    dw_1 i;
    private byte j = (byte)-1;
    private static final dc_1 k = new dc_1();
    @Deprecated
    public static final Parser<dc_1> d = new dd_2();

    dc_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dc_1() {
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dc_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                Object object;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.g = MapField.newMapField(df_2.a);
                            bl |= true;
                        }
                        object = (MapEntry)codedInputStream.readMessage(df_2.a.getParserForType(), extensionRegistryLite);
                        this.g.getMutableMap().put((Integer)object.getKey(), (dp_2)object.getValue());
                        continue block12;
                    }
                    case 18: {
                        object = null;
                        if ((this.f & 1) == 1) {
                            object = this.h.i();
                        }
                        this.h = (di_1)codedInputStream.readMessage(di_1.c, extensionRegistryLite);
                        if (object != null) {
                            ((dk_1)object).a(this.h);
                            this.h = ((dk_1)object).j();
                        }
                        this.f |= 1;
                        continue block12;
                    }
                    case 26: 
                }
                object = null;
                if ((this.f & 2) == 2) {
                    object = this.i.n();
                }
                this.i = (dw_1)codedInputStream.readMessage(dw_1.e, extensionRegistryLite);
                if (object != null) {
                    ((dy_1)object).a(this.i);
                    this.i = ((dy_1)object).o();
                }
                this.f |= 2;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return dn_1.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.r();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.b.ensureFieldAccessorsInitialized(dc_1.class, de_2.class);
    }

    MapField<Integer, dp_2> r() {
        if (this.g == null) {
            return MapField.emptyMapField(df_2.a);
        }
        return this.g;
    }

    @Override
    public int b() {
        return this.r().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.r().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, dp_2> c() {
        return this.d();
    }

    @Override
    public Map<Integer, dp_2> d() {
        return this.r().getMap();
    }

    @Override
    public dp_2 a(int n, dp_2 dp_22) {
        Map map = this.r().getMap();
        return map.containsKey(n) ? (dp_2)map.get(n) : dp_22;
    }

    @Override
    public dp_2 b(int n) {
        Map map = this.r().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dp_2)map.get(n);
    }

    @Override
    public boolean e() {
        return (this.f & 1) == 1;
    }

    @Override
    public di_1 f() {
        return this.h == null ? di_1.j() : this.h;
    }

    @Override
    public dq_2 g() {
        return this.h == null ? di_1.j() : this.h;
    }

    @Override
    public boolean h() {
        return (this.f & 2) == 2;
    }

    @Override
    public dw_1 i() {
        return this.i == null ? dw_1.o() : this.i;
    }

    @Override
    public db_1 j() {
        return this.i == null ? dw_1.o() : this.i;
    }

    public final boolean isInitialized() {
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (dp_2 dp_22 : this.d().values()) {
            if (dp_22.isInitialized()) continue;
            this.j = 0;
            return false;
        }
        if (this.e() && !this.f().isInitialized()) {
            this.j = 0;
            return false;
        }
        if (this.h() && !this.i().isInitialized()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.r(), df_2.a, (int)1);
        if ((this.f & 1) == 1) {
            codedOutputStream.writeMessage(2, (MessageLite)this.f());
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.writeMessage(3, (MessageLite)this.i());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.r().getMap().entrySet()) {
            MapEntry mapEntry = df_2.a.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((dp_2)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        if ((this.f & 1) == 1) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.f());
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.i());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dc_1)) {
            return super.equals(object);
        }
        dc_1 dc_12 = (dc_1)object;
        boolean bl = true;
        bl = bl && this.r().equals(dc_12.r());
        boolean bl2 = bl = bl && this.e() == dc_12.e();
        if (this.e()) {
            bl = bl && this.f().equals(dc_12.f());
        }
        boolean bl3 = bl = bl && this.h() == dc_12.h();
        if (this.h()) {
            bl = bl && this.i().equals(dc_12.i());
        }
        bl = bl && this.unknownFields.equals((Object)dc_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dc_1.a().hashCode();
        if (!this.r().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.r().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + this.f().hashCode();
        }
        if (this.h()) {
            n = 37 * n + 3;
            n = 53 * n + this.i().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dc_1 a(ByteBuffer byteBuffer) {
        return (dc_1)d.parseFrom(byteBuffer);
    }

    public static dc_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dc_1 a(ByteString byteString) {
        return (dc_1)d.parseFrom(byteString);
    }

    public static dc_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static dc_1 a(byte[] byArray) {
        return (dc_1)d.parseFrom(byArray);
    }

    public static dc_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static dc_1 a(InputStream inputStream) {
        return (dc_1)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static dc_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dc_1 b(InputStream inputStream) {
        return (dc_1)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static dc_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dc_1 a(CodedInputStream codedInputStream) {
        return (dc_1)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static dc_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dc_1)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public de_2 k() {
        return dc_1.l();
    }

    public static de_2 l() {
        return k.m();
    }

    public static de_2 a(dc_1 dc_12) {
        return k.m().a(dc_12);
    }

    public de_2 m() {
        return this == k ? new de_2() : new de_2().a(this);
    }

    protected de_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        de_2 de_22 = new de_2(builderParent);
        return de_22;
    }

    public static dc_1 n() {
        return k;
    }

    public static Parser<dc_1> o() {
        return d;
    }

    public Parser<dc_1> getParserForType() {
        return d;
    }

    public dc_1 p() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.m();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.k();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.p();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.p();
    }

    static /* synthetic */ boolean q() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(dc_1 dc_12) {
        return dc_12.unknownFields;
    }
}

