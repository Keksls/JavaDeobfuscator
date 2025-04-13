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

public final class Ag
extends GeneratedMessageV3.Builder<Ag>
implements Ah {
    private int a;
    private int b;
    private List<Aa> c = Collections.emptyList();
    private RepeatedFieldBuilderV3<Aa, Ac, Ad> d;
    private List<Integer> e = Collections.emptyList();
    private boolean f;

    public static final Descriptors.Descriptor a() {
        return zy_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zy_1.b.ensureFieldAccessorsInitialized(Ae.class, Ag.class);
    }

    Ag() {
        this.v();
    }

    Ag(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.v();
    }

    private void v() {
        if (Ae.q()) {
            this.x();
        }
    }

    public Ag k() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.d.clear();
        }
        this.e = Collections.emptyList();
        this.a &= 0xFFFFFFFB;
        this.f = false;
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zy_1.a;
    }

    public Ae l() {
        return Ae.n();
    }

    public Ae m() {
        Ae ae = this.n();
        if (!ae.isInitialized()) {
            throw Ag.newUninitializedMessageException((Message)ae);
        }
        return ae;
    }

    public Ae n() {
        Ae ae = new Ae(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ae.h = this.b;
        if (this.d == null) {
            if ((this.a & 2) == 2) {
                this.c = Collections.unmodifiableList(this.c);
                this.a &= 0xFFFFFFFD;
            }
            ae.i = this.c;
        } else {
            ae.i = this.d.build();
        }
        if ((this.a & 4) == 4) {
            this.e = Collections.unmodifiableList(this.e);
            this.a &= 0xFFFFFFFB;
        }
        ae.j = this.e;
        if ((n & 8) == 8) {
            n2 |= 2;
        }
        ae.k = this.f;
        ae.g = n2;
        this.onBuilt();
        return ae;
    }

    public Ag o() {
        return (Ag)super.clone();
    }

    public Ag a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Ag)super.setField(fieldDescriptor, object);
    }

    public Ag a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (Ag)super.clearField(fieldDescriptor);
    }

    public Ag a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (Ag)super.clearOneof(oneofDescriptor);
    }

    public Ag a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (Ag)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public Ag b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Ag)super.addRepeatedField(fieldDescriptor, object);
    }

    public Ag a(Message message) {
        if (message instanceof Ae) {
            return this.a((Ae)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public Ag a(Ae ae) {
        if (ae == Ae.n()) {
            return this;
        }
        if (ae.b()) {
            this.d(ae.c());
        }
        if (this.d == null) {
            if (!ae.i.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = ae.i;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.w();
                    this.c.addAll(ae.i);
                }
                this.onChanged();
            }
        } else if (!ae.i.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d.dispose();
                this.d = null;
                this.c = ae.i;
                this.a &= 0xFFFFFFFD;
                this.d = Ae.r() ? this.x() : null;
            } else {
                this.d.addAllMessages(ae.i);
            }
        }
        if (!ae.j.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e = ae.j;
                this.a &= 0xFFFFFFFB;
            } else {
                this.y();
                this.e.addAll(ae.j);
            }
            this.onChanged();
        }
        if (ae.i()) {
            this.a(ae.j());
        }
        this.b(Ae.b(ae));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.i()) {
            return false;
        }
        for (int k = 0; k < this.f(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public Ag a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Ae ae = null;
        try {
            ae = (Ae)Ae.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ae = (Ae)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ae != null) {
                this.a(ae);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public Ag d(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public Ag p() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    private void w() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<Aa>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<Aa> d() {
        if (this.d == null) {
            return Collections.unmodifiableList(this.c);
        }
        return this.d.getMessageList();
    }

    @Override
    public int f() {
        if (this.d == null) {
            return this.c.size();
        }
        return this.d.getCount();
    }

    @Override
    public Aa a(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (Aa)this.d.getMessage(n);
    }

    public Ag a(int n, Aa aa) {
        if (this.d == null) {
            if (aa == null) {
                throw new NullPointerException();
            }
            this.w();
            this.c.set(n, aa);
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)aa);
        }
        return this;
    }

    public Ag a(int n, Ac ac) {
        if (this.d == null) {
            this.w();
            this.c.set(n, ac.n());
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)ac.n());
        }
        return this;
    }

    public Ag a(Aa aa) {
        if (this.d == null) {
            if (aa == null) {
                throw new NullPointerException();
            }
            this.w();
            this.c.add(aa);
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)aa);
        }
        return this;
    }

    public Ag b(int n, Aa aa) {
        if (this.d == null) {
            if (aa == null) {
                throw new NullPointerException();
            }
            this.w();
            this.c.add(n, aa);
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)aa);
        }
        return this;
    }

    public Ag a(Ac ac) {
        if (this.d == null) {
            this.w();
            this.c.add(ac.n());
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)ac.n());
        }
        return this;
    }

    public Ag b(int n, Ac ac) {
        if (this.d == null) {
            this.w();
            this.c.add(n, ac.n());
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)ac.n());
        }
        return this;
    }

    public Ag a(Iterable<? extends Aa> iterable) {
        if (this.d == null) {
            this.w();
            AbstractMessageLite.Builder.addAll(iterable, this.c);
            this.onChanged();
        } else {
            this.d.addAllMessages(iterable);
        }
        return this;
    }

    public Ag q() {
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.d.clear();
        }
        return this;
    }

    public Ag e(int n) {
        if (this.d == null) {
            this.w();
            this.c.remove(n);
            this.onChanged();
        } else {
            this.d.remove(n);
        }
        return this;
    }

    public Ac f(int n) {
        return (Ac)this.x().getBuilder(n);
    }

    @Override
    public Ad b(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (Ad)this.d.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends Ad> e() {
        if (this.d != null) {
            return this.d.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.c);
    }

    public Ac r() {
        return (Ac)this.x().addBuilder((AbstractMessage)Aa.o());
    }

    public Ac g(int n) {
        return (Ac)this.x().addBuilder(n, (AbstractMessage)Aa.o());
    }

    public List<Ac> s() {
        return this.x().getBuilderList();
    }

    private RepeatedFieldBuilderV3<Aa, Ac, Ad> x() {
        if (this.d == null) {
            this.d = new RepeatedFieldBuilderV3(this.c, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    private void y() {
        if ((this.a & 4) != 4) {
            this.e = new ArrayList<Integer>(this.e);
            this.a |= 4;
        }
    }

    @Override
    public List<Integer> g() {
        return Collections.unmodifiableList(this.e);
    }

    @Override
    public int h() {
        return this.e.size();
    }

    @Override
    public int c(int n) {
        return this.e.get(n);
    }

    public Ag a(int n, int n2) {
        this.y();
        this.e.set(n, n2);
        this.onChanged();
        return this;
    }

    public Ag h(int n) {
        this.y();
        this.e.add(n);
        this.onChanged();
        return this;
    }

    public Ag b(Iterable<? extends Integer> iterable) {
        this.y();
        AbstractMessageLite.Builder.addAll(iterable, this.e);
        this.onChanged();
        return this;
    }

    public Ag t() {
        this.e = Collections.emptyList();
        this.a &= 0xFFFFFFFB;
        this.onChanged();
        return this;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public boolean j() {
        return this.f;
    }

    public Ag a(boolean bl) {
        this.a |= 8;
        this.f = bl;
        this.onChanged();
        return this;
    }

    public Ag u() {
        this.a &= 0xFFFFFFF7;
        this.f = false;
        this.onChanged();
        return this;
    }

    public final Ag a(UnknownFieldSet unknownFieldSet) {
        return (Ag)super.setUnknownFields(unknownFieldSet);
    }

    public final Ag b(UnknownFieldSet unknownFieldSet) {
        return (Ag)super.mergeUnknownFields(unknownFieldSet);
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
        return this.k();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.o();
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
        return this.k();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.o();
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
        return this.o();
    }

    public /* synthetic */ Message buildPartial() {
        return this.n();
    }

    public /* synthetic */ Message build() {
        return this.m();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.o();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.n();
    }

    public /* synthetic */ MessageLite build() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.k();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.o();
    }

    public /* synthetic */ Object clone() {
        return this.o();
    }
}

