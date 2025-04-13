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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
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
 * Renamed from co
 */
public final class co_1
extends GeneratedMessageV3
implements cr_1 {
    private static final long c = 0L;
    int d;
    public static final int a = 1;
    long e;
    public static final int b = 2;
    List<bg_2> f;
    private byte g = (byte)-1;
    private static final co_1 h = new co_1();
    static final Parser<co_1> i = new cp_1();

    co_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private co_1() {
        this.e = 0L;
        this.f = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    co_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n2)) continue block11;
                        bl = true;
                        continue block11;
                    }
                    case 8: {
                        this.e = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 18: 
                }
                if ((n & 2) != 2) {
                    this.f = new ArrayList<bg_2>();
                    n |= 2;
                }
                this.f.add((bg_2)codedInputStream.readMessage(bg_2.l(), extensionRegistryLite));
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
                this.f = Collections.unmodifiableList(this.f);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return ak_2.C;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.D.ensureFieldAccessorsInitialized(co_1.class, cq_2.class);
    }

    @Override
    public long b() {
        return this.e;
    }

    @Override
    public List<bg_2> c() {
        return this.f;
    }

    @Override
    public List<? extends bk_2> d() {
        return this.f;
    }

    @Override
    public int e() {
        return this.f.size();
    }

    @Override
    public bg_2 a(int n) {
        return this.f.get(n);
    }

    @Override
    public bk_2 b(int n) {
        return this.f.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.g;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.g = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.e != 0L) {
            codedOutputStream.writeInt64(1, this.e);
        }
        for (int k = 0; k < this.f.size(); ++k) {
            codedOutputStream.writeMessage(2, (MessageLite)this.f.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.e != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.e);
        }
        for (int k = 0; k < this.f.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.f.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof co_1)) {
            return super.equals(object);
        }
        co_1 co_12 = (co_1)object;
        boolean bl = true;
        bl = bl && this.b() == co_12.b();
        bl = bl && this.c().equals(co_12.c());
        bl = bl && this.unknownFields.equals((Object)co_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + co_1.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        if (this.e() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.c().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static co_1 a(ByteBuffer byteBuffer) {
        return (co_1)i.parseFrom(byteBuffer);
    }

    public static co_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (co_1)i.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static co_1 a(ByteString byteString) {
        return (co_1)i.parseFrom(byteString);
    }

    public static co_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (co_1)i.parseFrom(byteString, extensionRegistryLite);
    }

    public static co_1 a(byte[] byArray) {
        return (co_1)i.parseFrom(byArray);
    }

    public static co_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (co_1)i.parseFrom(byArray, extensionRegistryLite);
    }

    public static co_1 a(InputStream inputStream) {
        return (co_1)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream);
    }

    public static co_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (co_1)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static co_1 b(InputStream inputStream) {
        return (co_1)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream);
    }

    public static co_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (co_1)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static co_1 a(CodedInputStream codedInputStream) {
        return (co_1)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream);
    }

    public static co_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (co_1)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cq_2 f() {
        return co_1.g();
    }

    public static cq_2 g() {
        return h.h();
    }

    public static cq_2 a(co_1 co_12) {
        return h.h().a(co_12);
    }

    public cq_2 h() {
        return this == h ? new cq_2() : new cq_2().a(this);
    }

    protected cq_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        cq_2 cq_22 = new cq_2(builderParent);
        return cq_22;
    }

    public static co_1 i() {
        return h;
    }

    public static Parser<co_1> j() {
        return i;
    }

    public Parser<co_1> getParserForType() {
        return i;
    }

    public co_1 k() {
        return h;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean m() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(co_1 co_12) {
        return co_12.unknownFields;
    }
}

