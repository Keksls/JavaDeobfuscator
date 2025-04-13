/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class kQ
extends GeneratedMessageV3.Builder<kQ>
implements kV {
    private int a;
    private long b;
    private int c;
    private int d;
    private int e;
    private List<kR> f = Collections.emptyList();
    private RepeatedFieldBuilderV3<kR, kT, kU> g;

    public static final Descriptors.Descriptor a() {
        return kM.w;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.x.ensureFieldAccessorsInitialized(kO.class, kQ.class);
    }

    kQ() {
        this.y();
    }

    kQ(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.y();
    }

    private void y() {
        if (kO.s()) {
            this.A();
        }
    }

    public kQ m() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        if (this.g == null) {
            this.f = Collections.emptyList();
            this.a &= 0xFFFFFFEF;
        } else {
            this.g.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kM.w;
    }

    public kO n() {
        return kO.p();
    }

    public kO o() {
        kO kO2 = this.p();
        if (!kO2.isInitialized()) {
            throw kQ.newUninitializedMessageException((Message)kO2);
        }
        return kO2;
    }

    public kO p() {
        kO kO2 = new kO(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        kO2.i = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        kO2.j = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        kO2.k = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        kO2.l = this.e;
        if (this.g == null) {
            if ((this.a & 0x10) == 16) {
                this.f = Collections.unmodifiableList(this.f);
                this.a &= 0xFFFFFFEF;
            }
            kO2.m = this.f;
        } else {
            kO2.m = this.g.build();
        }
        kO2.h = n2;
        this.onBuilt();
        return kO2;
    }

    public kQ q() {
        return (kQ)super.clone();
    }

    public kQ a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kQ)super.setField(fieldDescriptor, object);
    }

    public kQ a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kQ)super.clearField(fieldDescriptor);
    }

    public kQ a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kQ)super.clearOneof(oneofDescriptor);
    }

    public kQ a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kQ)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kQ b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kQ)super.addRepeatedField(fieldDescriptor, object);
    }

    public kQ a(Message message) {
        if (message instanceof kO) {
            return this.a((kO)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kQ a(kO kO2) {
        if (kO2 == kO.p()) {
            return this;
        }
        if (kO2.b()) {
            this.a(kO2.c());
        }
        if (kO2.d()) {
            this.c(kO2.e());
        }
        if (kO2.f()) {
            this.d(kO2.g());
        }
        if (kO2.h()) {
            this.e(kO2.i());
        }
        if (this.g == null) {
            if (!kO2.m.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = kO2.m;
                    this.a &= 0xFFFFFFEF;
                } else {
                    this.z();
                    this.f.addAll(kO2.m);
                }
                this.onChanged();
            }
        } else if (!kO2.m.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g.dispose();
                this.g = null;
                this.f = kO2.m;
                this.a &= 0xFFFFFFEF;
                this.g = kO.t() ? this.A() : null;
            } else {
                this.g.addAllMessages(kO2.m);
            }
        }
        this.b(kO.b(kO2));
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
        if (!this.f()) {
            return false;
        }
        if (!this.h()) {
            return false;
        }
        for (int k = 0; k < this.l(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public kQ a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kO kO2 = null;
        try {
            kO2 = (kO)kO.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kO2 = (kO)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kO2 != null) {
                this.a(kO2);
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

    public kQ a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public kQ r() {
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
    public int e() {
        return this.c;
    }

    public kQ c(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public kQ s() {
        this.a &= 0xFFFFFFFD;
        this.c = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public int g() {
        return this.d;
    }

    public kQ d(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public kQ t() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean h() {
        return (this.a & 8) == 8;
    }

    @Override
    public int i() {
        return this.e;
    }

    public kQ e(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public kQ u() {
        this.a &= 0xFFFFFFF7;
        this.e = 0;
        this.onChanged();
        return this;
    }

    private void z() {
        if ((this.a & 0x10) != 16) {
            this.f = new ArrayList<kR>(this.f);
            this.a |= 0x10;
        }
    }

    @Override
    public List<kR> j() {
        if (this.g == null) {
            return Collections.unmodifiableList(this.f);
        }
        return this.g.getMessageList();
    }

    @Override
    public int l() {
        if (this.g == null) {
            return this.f.size();
        }
        return this.g.getCount();
    }

    @Override
    public kR a(int n) {
        if (this.g == null) {
            return this.f.get(n);
        }
        return (kR)this.g.getMessage(n);
    }

    public kQ a(int n, kR kR2) {
        if (this.g == null) {
            if (kR2 == null) {
                throw new NullPointerException();
            }
            this.z();
            this.f.set(n, kR2);
            this.onChanged();
        } else {
            this.g.setMessage(n, (AbstractMessage)kR2);
        }
        return this;
    }

    public kQ a(int n, kT kT2) {
        if (this.g == null) {
            this.z();
            this.f.set(n, kT2.i());
            this.onChanged();
        } else {
            this.g.setMessage(n, (AbstractMessage)kT2.i());
        }
        return this;
    }

    public kQ a(kR kR2) {
        if (this.g == null) {
            if (kR2 == null) {
                throw new NullPointerException();
            }
            this.z();
            this.f.add(kR2);
            this.onChanged();
        } else {
            this.g.addMessage((AbstractMessage)kR2);
        }
        return this;
    }

    public kQ b(int n, kR kR2) {
        if (this.g == null) {
            if (kR2 == null) {
                throw new NullPointerException();
            }
            this.z();
            this.f.add(n, kR2);
            this.onChanged();
        } else {
            this.g.addMessage(n, (AbstractMessage)kR2);
        }
        return this;
    }

    public kQ a(kT kT2) {
        if (this.g == null) {
            this.z();
            this.f.add(kT2.i());
            this.onChanged();
        } else {
            this.g.addMessage((AbstractMessage)kT2.i());
        }
        return this;
    }

    public kQ b(int n, kT kT2) {
        if (this.g == null) {
            this.z();
            this.f.add(n, kT2.i());
            this.onChanged();
        } else {
            this.g.addMessage(n, (AbstractMessage)kT2.i());
        }
        return this;
    }

    public kQ a(Iterable<? extends kR> iterable) {
        if (this.g == null) {
            this.z();
            AbstractMessageLite.Builder.addAll(iterable, this.f);
            this.onChanged();
        } else {
            this.g.addAllMessages(iterable);
        }
        return this;
    }

    public kQ v() {
        if (this.g == null) {
            this.f = Collections.emptyList();
            this.a &= 0xFFFFFFEF;
            this.onChanged();
        } else {
            this.g.clear();
        }
        return this;
    }

    public kQ f(int n) {
        if (this.g == null) {
            this.z();
            this.f.remove(n);
            this.onChanged();
        } else {
            this.g.remove(n);
        }
        return this;
    }

    public kT g(int n) {
        return (kT)this.A().getBuilder(n);
    }

    @Override
    public kU b(int n) {
        if (this.g == null) {
            return this.f.get(n);
        }
        return (kU)this.g.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kU> k() {
        if (this.g != null) {
            return this.g.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.f);
    }

    public kT w() {
        return (kT)this.A().addBuilder((AbstractMessage)kR.j());
    }

    public kT h(int n) {
        return (kT)this.A().addBuilder(n, (AbstractMessage)kR.j());
    }

    public List<kT> x() {
        return this.A().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kR, kT, kU> A() {
        if (this.g == null) {
            this.g = new RepeatedFieldBuilderV3(this.f, (this.a & 0x10) == 16, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.f = null;
        }
        return this.g;
    }

    public final kQ a(UnknownFieldSet unknownFieldSet) {
        return (kQ)super.setUnknownFields(unknownFieldSet);
    }

    public final kQ b(UnknownFieldSet unknownFieldSet) {
        return (kQ)super.mergeUnknownFields(unknownFieldSet);
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
        return this.m();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.q();
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
        return this.m();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.q();
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
        return this.q();
    }

    public /* synthetic */ Message buildPartial() {
        return this.p();
    }

    public /* synthetic */ Message build() {
        return this.o();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.q();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.p();
    }

    public /* synthetic */ MessageLite build() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.m();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.q();
    }

    public /* synthetic */ Object clone() {
        return this.q();
    }
}

