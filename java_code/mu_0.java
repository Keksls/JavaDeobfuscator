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
 * Renamed from mU
 */
public final class mu_0
extends GeneratedMessageV3
implements mX {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    mu g;
    public static final int b = 2;
    List<mq_1> h;
    public static final int c = 3;
    long i;
    private byte j = (byte)-1;
    private static final mu_0 k = new mu_0();
    @Deprecated
    public static final Parser<mu_0> d = new mv_0();

    mu_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mu_0() {
        this.h = Collections.emptyList();
        this.i = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mu_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        mw mw2 = null;
                        if ((this.f & 1) == 1) {
                            mw2 = this.g.j();
                        }
                        this.g = (mu)codedInputStream.readMessage(mu.d, extensionRegistryLite);
                        if (mw2 != null) {
                            mw2.a(this.g);
                            this.g = mw2.k();
                        }
                        this.f |= 1;
                        continue block12;
                    }
                    case 18: {
                        if ((n & 2) != 2) {
                            this.h = new ArrayList<mq_1>();
                            n |= 2;
                        }
                        this.h.add((mq_1)codedInputStream.readMessage(mq_1.p, extensionRegistryLite));
                        continue block12;
                    }
                    case 24: 
                }
                this.f |= 2;
                this.i = codedInputStream.readInt64();
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
                this.h = Collections.unmodifiableList(this.h);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return mo_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mo_0.b.ensureFieldAccessorsInitialized(mu_0.class, mw_0.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public mu c() {
        return this.g == null ? mu.k() : this.g;
    }

    @Override
    public mx_0 d() {
        return this.g == null ? mu.k() : this.g;
    }

    @Override
    public List<mq_1> e() {
        return this.h;
    }

    @Override
    public List<? extends mT> f() {
        return this.h;
    }

    @Override
    public int g() {
        return this.h.size();
    }

    @Override
    public mq_1 a(int n) {
        return this.h.get(n);
    }

    @Override
    public mT b(int n) {
        return this.h.get(n);
    }

    @Override
    public boolean h() {
        return (this.f & 2) == 2;
    }

    @Override
    public long i() {
        return this.i;
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
        if (!this.h()) {
            this.j = 0;
            return false;
        }
        if (!this.c().isInitialized()) {
            this.j = 0;
            return false;
        }
        for (int k = 0; k < this.g(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.writeMessage(1, (MessageLite)this.c());
        }
        for (int k = 0; k < this.h.size(); ++k) {
            codedOutputStream.writeMessage(2, (MessageLite)this.h.get(k));
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.writeInt64(3, this.i);
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
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.c());
        }
        for (int k = 0; k < this.h.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.h.get(k)));
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.i);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mu_0)) {
            return super.equals(object);
        }
        mu_0 mu_02 = (mu_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == mu_02.b();
        if (this.b()) {
            bl = bl && this.c().equals(mu_02.c());
        }
        bl = bl && this.e().equals(mu_02.e());
        boolean bl3 = bl = bl && this.h() == mu_02.h();
        if (this.h()) {
            bl = bl && this.i() == mu_02.i();
        }
        bl = bl && this.unknownFields.equals((Object)mu_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mu_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.g() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.h()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.i());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mu_0 a(ByteBuffer byteBuffer) {
        return (mu_0)d.parseFrom(byteBuffer);
    }

    public static mu_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mu_0)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mu_0 a(ByteString byteString) {
        return (mu_0)d.parseFrom(byteString);
    }

    public static mu_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mu_0)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static mu_0 a(byte[] byArray) {
        return (mu_0)d.parseFrom(byArray);
    }

    public static mu_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mu_0)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static mu_0 a(InputStream inputStream) {
        return (mu_0)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static mu_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mu_0)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mu_0 b(InputStream inputStream) {
        return (mu_0)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static mu_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mu_0)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mu_0 a(CodedInputStream codedInputStream) {
        return (mu_0)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static mu_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mu_0)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mw_0 j() {
        return mu_0.k();
    }

    public static mw_0 k() {
        return k.l();
    }

    public static mw_0 a(mu_0 mu_02) {
        return k.l().a(mu_02);
    }

    public mw_0 l() {
        return this == k ? new mw_0() : new mw_0().a(this);
    }

    protected mw_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        mw_0 mw_02 = new mw_0(builderParent);
        return mw_02;
    }

    public static mu_0 m() {
        return k;
    }

    public static Parser<mu_0> n() {
        return d;
    }

    public Parser<mu_0> getParserForType() {
        return d;
    }

    public mu_0 o() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean q() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mu_0 mu_02) {
        return mu_02.unknownFields;
    }
}

