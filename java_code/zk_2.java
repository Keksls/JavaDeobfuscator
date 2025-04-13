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
 * Renamed from zK
 */
public final class zk_2
extends GeneratedMessageV3
implements zn_2 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    int g;
    public static final int b = 2;
    int h;
    public static final int c = 3;
    List<zg_2> i;
    private byte j = (byte)-1;
    private static final zk_2 k = new zk_2();
    @Deprecated
    public static final Parser<zk_2> d = new zl_2();

    zk_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zk_2() {
        this.g = 0;
        this.h = 0;
        this.i = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zk_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block12;
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.f |= 1;
                        this.g = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.f |= 2;
                        this.h = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 26: 
                }
                if ((n & 4) != 4) {
                    this.i = new ArrayList<zg_2>();
                    n |= 4;
                }
                this.i.add((zg_2)codedInputStream.readMessage(zg_2.i, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 4) == 4) {
                this.i = Collections.unmodifiableList(this.i);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return zw_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zw_1.b.ensureFieldAccessorsInitialized(zk_2.class, zm_2.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public int c() {
        return this.g;
    }

    @Override
    public boolean d() {
        return (this.f & 2) == 2;
    }

    @Override
    public int e() {
        return this.h;
    }

    @Override
    public List<zg_2> f() {
        return this.i;
    }

    @Override
    public List<? extends zj_2> g() {
        return this.i;
    }

    @Override
    public int h() {
        return this.i.size();
    }

    @Override
    public zg_2 a(int n) {
        return this.i.get(n);
    }

    @Override
    public zj_2 b(int n) {
        return this.i.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.j = 0;
            return false;
        }
        if (!this.d()) {
            this.j = 0;
            return false;
        }
        for (int k = 0; k < this.h(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.writeInt32(1, this.g);
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.writeInt32(2, this.h);
        }
        for (int k = 0; k < this.i.size(); ++k) {
            codedOutputStream.writeMessage(3, (MessageLite)this.i.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.f & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.g);
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.h);
        }
        for (int k = 0; k < this.i.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.i.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zk_2)) {
            return super.equals(object);
        }
        zk_2 zk_22 = (zk_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == zk_22.b();
        if (this.b()) {
            bl = bl && this.c() == zk_22.c();
        }
        boolean bl3 = bl = bl && this.d() == zk_22.d();
        if (this.d()) {
            bl = bl && this.e() == zk_22.e();
        }
        bl = bl && this.f().equals(zk_22.f());
        bl = bl && this.unknownFields.equals((Object)zk_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zk_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        if (this.h() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.f().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zk_2 a(ByteBuffer byteBuffer) {
        return (zk_2)d.parseFrom(byteBuffer);
    }

    public static zk_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zk_2 a(ByteString byteString) {
        return (zk_2)d.parseFrom(byteString);
    }

    public static zk_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static zk_2 a(byte[] byArray) {
        return (zk_2)d.parseFrom(byArray);
    }

    public static zk_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static zk_2 a(InputStream inputStream) {
        return (zk_2)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static zk_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zk_2 b(InputStream inputStream) {
        return (zk_2)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static zk_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zk_2 a(CodedInputStream codedInputStream) {
        return (zk_2)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static zk_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zm_2 i() {
        return zk_2.j();
    }

    public static zm_2 j() {
        return k.k();
    }

    public static zm_2 a(zk_2 zk_22) {
        return k.k().a(zk_22);
    }

    public zm_2 k() {
        return this == k ? new zm_2() : new zm_2().a(this);
    }

    protected zm_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        zm_2 zm_22 = new zm_2(builderParent);
        return zm_22;
    }

    public static zk_2 l() {
        return k;
    }

    public static Parser<zk_2> m() {
        return d;
    }

    public Parser<zk_2> getParserForType() {
        return d;
    }

    public zk_2 n() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.n();
    }

    static /* synthetic */ boolean o() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(zk_2 zk_22) {
        return zk_22.unknownFields;
    }
}

