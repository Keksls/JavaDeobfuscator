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
 *  com.google.protobuf.LazyStringArrayList
 *  com.google.protobuf.LazyStringList
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.ProtocolStringList
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bg
 */
public final class bg_2
extends GeneratedMessageV3
implements bk_2 {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    int f;
    public static final int b = 2;
    LazyStringList g;
    public static final int c = 3;
    MapField<String, String> h;
    private byte i = (byte)-1;
    private static final bg_2 j = new bg_2();
    static final Parser<bg_2> k = new bh_1();

    bg_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bg_2() {
        this.f = 0;
        this.g = LazyStringArrayList.EMPTY;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bg_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                String string;
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n2)) continue block12;
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.f = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 18: {
                        string = codedInputStream.readStringRequireUtf8();
                        if ((n & 2) != 2) {
                            this.g = new LazyStringArrayList();
                            n |= 2;
                        }
                        this.g.add((Object)string);
                        continue block12;
                    }
                    case 26: 
                }
                if ((n & 4) != 4) {
                    this.h = MapField.newMapField(bj_1.a);
                    n |= 4;
                }
                string = (MapEntry)codedInputStream.readMessage(bj_1.a.getParserForType(), extensionRegistryLite);
                this.h.getMutableMap().put((String)string.getKey(), (String)string.getValue());
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 2) == 2) {
                this.g = this.g.getUnmodifiableView();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return ak_2.U;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 3: {
                return this.p();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.V.ensureFieldAccessorsInitialized(bg_2.class, bi_2.class);
    }

    @Override
    public int b() {
        return this.f;
    }

    public ProtocolStringList c() {
        return this.g;
    }

    @Override
    public int d() {
        return this.g.size();
    }

    @Override
    public String a(int n) {
        return (String)this.g.get(n);
    }

    @Override
    public ByteString b(int n) {
        return this.g.getByteString(n);
    }

    MapField<String, String> p() {
        if (this.h == null) {
            return MapField.emptyMapField(bj_1.a);
        }
        return this.h;
    }

    @Override
    public int e() {
        return this.p().getMap().size();
    }

    @Override
    public boolean a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        return this.p().getMap().containsKey(string);
    }

    @Override
    @Deprecated
    public Map<String, String> f() {
        return this.g();
    }

    @Override
    public Map<String, String> g() {
        return this.p().getMap();
    }

    @Override
    public String a(String string, String string2) {
        if (string == null) {
            throw new NullPointerException();
        }
        Map map = this.p().getMap();
        return map.containsKey(string) ? (String)map.get(string) : string2;
    }

    @Override
    public String b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        Map map = this.p().getMap();
        if (!map.containsKey(string)) {
            throw new IllegalArgumentException();
        }
        return (String)map.get(string);
    }

    public final boolean isInitialized() {
        byte by = this.i;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.i = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.f != 0) {
            codedOutputStream.writeInt32(1, this.f);
        }
        for (int k = 0; k < this.g.size(); ++k) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.g.getRaw(k));
        }
        GeneratedMessageV3.serializeStringMapTo((CodedOutputStream)codedOutputStream, this.p(), bj_1.a, (int)3);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.f != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.f);
        }
        int n2 = 0;
        for (int k = 0; k < this.g.size(); ++k) {
            n2 += bg_2.computeStringSizeNoTag((Object)this.g.getRaw(k));
        }
        n += n2;
        n += 1 * this.c().size();
        for (Map.Entry entry : this.p().getMap().entrySet()) {
            MapEntry mapEntry = bj_1.a.newBuilderForType().setKey((Object)((String)entry.getKey())).setValue((Object)((String)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bg_2)) {
            return super.equals(object);
        }
        bg_2 bg_22 = (bg_2)object;
        boolean bl = true;
        bl = bl && this.b() == bg_22.b();
        bl = bl && this.c().equals(bg_22.c());
        bl = bl && this.p().equals(bg_22.p());
        bl = bl && this.unknownFields.equals((Object)bg_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bg_2.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.b();
        if (this.d() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.c().hashCode();
        }
        if (!this.p().getMap().isEmpty()) {
            n = 37 * n + 3;
            n = 53 * n + this.p().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bg_2 a(ByteBuffer byteBuffer) {
        return (bg_2)k.parseFrom(byteBuffer);
    }

    public static bg_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_2)k.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bg_2 a(ByteString byteString) {
        return (bg_2)k.parseFrom(byteString);
    }

    public static bg_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_2)k.parseFrom(byteString, extensionRegistryLite);
    }

    public static bg_2 a(byte[] byArray) {
        return (bg_2)k.parseFrom(byArray);
    }

    public static bg_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_2)k.parseFrom(byArray, extensionRegistryLite);
    }

    public static bg_2 a(InputStream inputStream) {
        return (bg_2)GeneratedMessageV3.parseWithIOException(k, (InputStream)inputStream);
    }

    public static bg_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_2)GeneratedMessageV3.parseWithIOException(k, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bg_2 b(InputStream inputStream) {
        return (bg_2)GeneratedMessageV3.parseDelimitedWithIOException(k, (InputStream)inputStream);
    }

    public static bg_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_2)GeneratedMessageV3.parseDelimitedWithIOException(k, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bg_2 a(CodedInputStream codedInputStream) {
        return (bg_2)GeneratedMessageV3.parseWithIOException(k, (CodedInputStream)codedInputStream);
    }

    public static bg_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_2)GeneratedMessageV3.parseWithIOException(k, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bi_2 h() {
        return bg_2.i();
    }

    public static bi_2 i() {
        return j.j();
    }

    public static bi_2 a(bg_2 bg_22) {
        return j.j().a(bg_22);
    }

    public bi_2 j() {
        return this == j ? new bi_2() : new bi_2().a(this);
    }

    protected bi_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        bi_2 bi_22 = new bi_2(builderParent);
        return bi_22;
    }

    public static bg_2 k() {
        return j;
    }

    public static Parser<bg_2> l() {
        return k;
    }

    public Parser<bg_2> getParserForType() {
        return k;
    }

    public bg_2 m() {
        return j;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ List n() {
        return this.c();
    }

    static /* synthetic */ boolean o() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bg_2 bg_22) {
        return bg_22.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        bg_2.checkByteStringIsUtf8((ByteString)byteString);
    }
}

