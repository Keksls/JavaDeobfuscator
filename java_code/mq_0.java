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
 * Renamed from mq
 */
public final class mq_0
extends GeneratedMessageV3
implements mt_0 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    mu g;
    public static final int b = 2;
    List<mm_0> h;
    public static final int c = 3;
    long i;
    private byte j = (byte)-1;
    private static final mq_0 k = new mq_0();
    @Deprecated
    public static final Parser<mq_0> d = new mr_1();

    mq_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mq_0() {
        this.h = Collections.emptyList();
        this.i = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mq_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.h = new ArrayList<mm_0>();
                            n |= 2;
                        }
                        this.h.add((mm_0)codedInputStream.readMessage(mm_0.i, extensionRegistryLite));
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
        return mk.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mk.b.ensureFieldAccessorsInitialized(mq_0.class, ms_0.class);
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
    public List<mm_0> e() {
        return this.h;
    }

    @Override
    public List<? extends mp_0> f() {
        return this.h;
    }

    @Override
    public int g() {
        return this.h.size();
    }

    @Override
    public mm_0 a(int n) {
        return this.h.get(n);
    }

    @Override
    public mp_0 b(int n) {
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
        if (!(object instanceof mq_0)) {
            return super.equals(object);
        }
        mq_0 mq_02 = (mq_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == mq_02.b();
        if (this.b()) {
            bl = bl && this.c().equals(mq_02.c());
        }
        bl = bl && this.e().equals(mq_02.e());
        boolean bl3 = bl = bl && this.h() == mq_02.h();
        if (this.h()) {
            bl = bl && this.i() == mq_02.i();
        }
        bl = bl && this.unknownFields.equals((Object)mq_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mq_0.a().hashCode();
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

    public static mq_0 a(ByteBuffer byteBuffer) {
        return (mq_0)d.parseFrom(byteBuffer);
    }

    public static mq_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_0)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mq_0 a(ByteString byteString) {
        return (mq_0)d.parseFrom(byteString);
    }

    public static mq_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_0)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static mq_0 a(byte[] byArray) {
        return (mq_0)d.parseFrom(byArray);
    }

    public static mq_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_0)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static mq_0 a(InputStream inputStream) {
        return (mq_0)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static mq_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_0)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mq_0 b(InputStream inputStream) {
        return (mq_0)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static mq_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_0)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mq_0 a(CodedInputStream codedInputStream) {
        return (mq_0)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static mq_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_0)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ms_0 j() {
        return mq_0.k();
    }

    public static ms_0 k() {
        return k.l();
    }

    public static ms_0 a(mq_0 mq_02) {
        return k.l().a(mq_02);
    }

    public ms_0 l() {
        return this == k ? new ms_0() : new ms_0().a(this);
    }

    protected ms_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        ms_0 ms_02 = new ms_0(builderParent);
        return ms_02;
    }

    public static mq_0 m() {
        return k;
    }

    public static Parser<mq_0> n() {
        return d;
    }

    public Parser<mq_0> getParserForType() {
        return d;
    }

    public mq_0 o() {
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

    static /* synthetic */ UnknownFieldSet b(mq_0 mq_02) {
        return mq_02.unknownFields;
    }
}

