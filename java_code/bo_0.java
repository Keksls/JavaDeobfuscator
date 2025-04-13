/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal$ListAdapter
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from Bo
 */
public final class bo_0
extends GeneratedMessageV3.Builder<bo_0>
implements Bp {
    private int a;
    private long b;
    private long c;
    private List<Integer> d = Collections.emptyList();
    private List<Integer> e = Collections.emptyList();
    private int f;
    private boolean g;

    public static final Descriptors.Descriptor a() {
        return AO.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.l.ensureFieldAccessorsInitialized(bk_0.class, bo_0.class);
    }

    bo_0() {
        this.y();
    }

    bo_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.y();
    }

    private void y() {
        if (bk_0.t()) {
            // empty if block
        }
    }

    public bo_0 n() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        this.d = Collections.emptyList();
        this.a &= 0xFFFFFFFB;
        this.e = Collections.emptyList();
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.a &= 0xFFFFFFEF;
        this.g = false;
        this.a &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return AO.k;
    }

    public bk_0 o() {
        return bk_0.q();
    }

    public bk_0 p() {
        bk_0 bk_02 = this.q();
        if (!bk_02.isInitialized()) {
            throw bo_0.newUninitializedMessageException((Message)bk_02);
        }
        return bk_02;
    }

    public bk_0 q() {
        bk_0 bk_02 = new bk_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        bk_02.j = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        bk_02.k = this.c;
        if ((this.a & 4) == 4) {
            this.d = Collections.unmodifiableList(this.d);
            this.a &= 0xFFFFFFFB;
        }
        bk_02.l = this.d;
        if ((this.a & 8) == 8) {
            this.e = Collections.unmodifiableList(this.e);
            this.a &= 0xFFFFFFF7;
        }
        bk_02.n = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 4;
        }
        bk_02.p = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 8;
        }
        bk_02.q = this.g;
        bk_02.i = n2;
        this.onBuilt();
        return bk_02;
    }

    public bo_0 r() {
        return (bo_0)super.clone();
    }

    public bo_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bo_0)super.setField(fieldDescriptor, object);
    }

    public bo_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bo_0)super.clearField(fieldDescriptor);
    }

    public bo_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bo_0)super.clearOneof(oneofDescriptor);
    }

    public bo_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bo_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bo_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bo_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public bo_0 a(Message message) {
        if (message instanceof bk_0) {
            return this.a((bk_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bo_0 a(bk_0 bk_02) {
        if (bk_02 == bk_0.q()) {
            return this;
        }
        if (bk_02.b()) {
            this.a(bk_02.c());
        }
        if (bk_02.d()) {
            this.b(bk_02.e());
        }
        if (!bk_02.l.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = bk_02.l;
                this.a &= 0xFFFFFFFB;
            } else {
                this.z();
                this.d.addAll(bk_02.l);
            }
            this.onChanged();
        }
        if (!bk_02.n.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e = bk_02.n;
                this.a &= 0xFFFFFFF7;
            } else {
                this.A();
                this.e.addAll(bk_02.n);
            }
            this.onChanged();
        }
        if (bk_02.j()) {
            this.c(bk_02.k());
        }
        if (bk_02.l()) {
            this.a(bk_02.m());
        }
        this.b(bk_0.b(bk_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        return this.l();
    }

    public bo_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bk_0 bk_02 = null;
        try {
            bk_02 = (bk_0)bk_0.g.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bk_02 = (bk_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bk_02 != null) {
                this.a(bk_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public bo_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public bo_0 s() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public long e() {
        return this.c;
    }

    public bo_0 b(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public bo_0 t() {
        this.a &= 0xFFFFFFFD;
        this.c = 0L;
        this.onChanged();
        return this;
    }

    private void z() {
        if ((this.a & 4) != 4) {
            this.d = new ArrayList<Integer>(this.d);
            this.a |= 4;
        }
    }

    @Override
    public List<bj_0> f() {
        return new Internal.ListAdapter(this.d, bk_0.m);
    }

    @Override
    public int g() {
        return this.d.size();
    }

    @Override
    public bj_0 a(int n) {
        return (bj_0)((Object)bk_0.m.convert((Object)this.d.get(n)));
    }

    public bo_0 a(int n, bj_0 bj_02) {
        if (bj_02 == null) {
            throw new NullPointerException();
        }
        this.z();
        this.d.set(n, bj_02.getNumber());
        this.onChanged();
        return this;
    }

    public bo_0 a(bj_0 bj_02) {
        if (bj_02 == null) {
            throw new NullPointerException();
        }
        this.z();
        this.d.add(bj_02.getNumber());
        this.onChanged();
        return this;
    }

    public bo_0 a(Iterable<? extends bj_0> iterable) {
        this.z();
        for (bj_0 bj_02 : iterable) {
            this.d.add(bj_02.getNumber());
        }
        this.onChanged();
        return this;
    }

    public bo_0 u() {
        this.d = Collections.emptyList();
        this.a &= 0xFFFFFFFB;
        this.onChanged();
        return this;
    }

    private void A() {
        if ((this.a & 8) != 8) {
            this.e = new ArrayList<Integer>(this.e);
            this.a |= 8;
        }
    }

    @Override
    public List<bq_0> h() {
        return new Internal.ListAdapter(this.e, bk_0.o);
    }

    @Override
    public int i() {
        return this.e.size();
    }

    @Override
    public bq_0 b(int n) {
        return (bq_0)((Object)bk_0.o.convert((Object)this.e.get(n)));
    }

    public bo_0 a(int n, bq_0 bq_02) {
        if (bq_02 == null) {
            throw new NullPointerException();
        }
        this.A();
        this.e.set(n, bq_02.getNumber());
        this.onChanged();
        return this;
    }

    public bo_0 a(bq_0 bq_02) {
        if (bq_02 == null) {
            throw new NullPointerException();
        }
        this.A();
        this.e.add(bq_02.getNumber());
        this.onChanged();
        return this;
    }

    public bo_0 b(Iterable<? extends bq_0> iterable) {
        this.A();
        for (bq_0 bq_02 : iterable) {
            this.e.add(bq_02.getNumber());
        }
        this.onChanged();
        return this;
    }

    public bo_0 v() {
        this.e = Collections.emptyList();
        this.a &= 0xFFFFFFF7;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public int k() {
        return this.f;
    }

    public bo_0 c(int n) {
        this.a |= 0x10;
        this.f = n;
        this.onChanged();
        return this;
    }

    public bo_0 w() {
        this.a &= 0xFFFFFFEF;
        this.f = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean l() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public boolean m() {
        return this.g;
    }

    public bo_0 a(boolean bl) {
        this.a |= 0x20;
        this.g = bl;
        this.onChanged();
        return this;
    }

    public bo_0 x() {
        this.a &= 0xFFFFFFDF;
        this.g = false;
        this.onChanged();
        return this;
    }

    public final bo_0 a(UnknownFieldSet unknownFieldSet) {
        return (bo_0)super.setUnknownFields(unknownFieldSet);
    }

    public final bo_0 b(UnknownFieldSet unknownFieldSet) {
        return (bo_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.n();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.r();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.n();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.r();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.r();
    }

    public /* synthetic */ Message buildPartial() {
        return this.q();
    }

    public /* synthetic */ Message build() {
        return this.p();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.r();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.q();
    }

    public /* synthetic */ MessageLite build() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.n();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.r();
    }

    public /* synthetic */ Object clone() {
        return this.r();
    }
}

