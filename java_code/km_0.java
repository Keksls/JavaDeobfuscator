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

/*
 * Renamed from km
 */
public final class km_0
extends GeneratedMessageV3
implements kx_0 {
    private static final long d = 0L;
    public static final int a = 1;
    List<kp_0> e;
    public static final int b = 2;
    List<kt_0> f;
    private byte g = (byte)-1;
    private static final km_0 h = new km_0();
    @Deprecated
    public static final Parser<km_0> c = new kn_0();

    km_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private km_0() {
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    km_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block11: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block11;
                        bl = true;
                        continue block11;
                    }
                    case 10: {
                        if ((n & 1) != 1) {
                            this.e = new ArrayList<kp_0>();
                            n |= 1;
                        }
                        this.e.add((kp_0)codedInputStream.readMessage(kp_0.e, extensionRegistryLite));
                        continue block11;
                    }
                    case 18: 
                }
                if ((n & 2) != 2) {
                    this.f = new ArrayList<kt_0>();
                    n |= 2;
                }
                this.f.add((kt_0)codedInputStream.readMessage(kt_0.d, extensionRegistryLite));
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
                this.e = Collections.unmodifiableList(this.e);
            }
            if ((n & 2) == 2) {
                this.f = Collections.unmodifiableList(this.f);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return kg.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kg.f.ensureFieldAccessorsInitialized(km_0.class, ko_0.class);
    }

    @Override
    public List<kp_0> b() {
        return this.e;
    }

    @Override
    public List<? extends ks_0> c() {
        return this.e;
    }

    @Override
    public int d() {
        return this.e.size();
    }

    @Override
    public kp_0 a(int n) {
        return this.e.get(n);
    }

    @Override
    public ks_0 b(int n) {
        return this.e.get(n);
    }

    @Override
    public List<kt_0> e() {
        return this.f;
    }

    @Override
    public List<? extends kw_0> f() {
        return this.f;
    }

    @Override
    public int g() {
        return this.f.size();
    }

    @Override
    public kt_0 c(int n) {
        return this.f.get(n);
    }

    @Override
    public kw_0 d(int n) {
        return this.f.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.g;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (n = 0; n < this.d(); ++n) {
            if (this.a(n).isInitialized()) continue;
            this.g = 0;
            return false;
        }
        for (n = 0; n < this.g(); ++n) {
            if (this.c(n).isInitialized()) continue;
            this.g = 0;
            return false;
        }
        this.g = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        for (n = 0; n < this.e.size(); ++n) {
            codedOutputStream.writeMessage(1, (MessageLite)this.e.get(n));
        }
        for (n = 0; n < this.f.size(); ++n) {
            codedOutputStream.writeMessage(2, (MessageLite)this.f.get(n));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        for (n = 0; n < this.e.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.e.get(n)));
        }
        for (n = 0; n < this.f.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.f.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof km_0)) {
            return super.equals(object);
        }
        km_0 km_02 = (km_0)object;
        boolean bl = true;
        bl = bl && this.b().equals(km_02.b());
        bl = bl && this.e().equals(km_02.e());
        bl = bl && this.unknownFields.equals((Object)km_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + km_0.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        if (this.g() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static km_0 a(ByteBuffer byteBuffer) {
        return (km_0)c.parseFrom(byteBuffer);
    }

    public static km_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (km_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static km_0 a(ByteString byteString) {
        return (km_0)c.parseFrom(byteString);
    }

    public static km_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (km_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static km_0 a(byte[] byArray) {
        return (km_0)c.parseFrom(byArray);
    }

    public static km_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (km_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static km_0 a(InputStream inputStream) {
        return (km_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static km_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (km_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static km_0 b(InputStream inputStream) {
        return (km_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static km_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (km_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static km_0 a(CodedInputStream codedInputStream) {
        return (km_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static km_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (km_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ko_0 h() {
        return km_0.i();
    }

    public static ko_0 i() {
        return h.j();
    }

    public static ko_0 a(km_0 km_02) {
        return h.j().a(km_02);
    }

    public ko_0 j() {
        return this == h ? new ko_0() : new ko_0().a(this);
    }

    protected ko_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        ko_0 ko_02 = new ko_0(builderParent);
        return ko_02;
    }

    public static km_0 k() {
        return h;
    }

    public static Parser<km_0> l() {
        return c;
    }

    public Parser<km_0> getParserForType() {
        return c;
    }

    public km_0 m() {
        return h;
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

    static /* synthetic */ boolean n() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean o() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(km_0 km_02) {
        return km_02.unknownFields;
    }
}

