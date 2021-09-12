package org.formacion;

public class IMOAdapter implements InternationalMoneyOrganization {
    private BancoNostrum bancoNostrumIml;

    public IMOAdapter(BancoNostrum bancoNostrum){
        this.bancoNostrumIml = bancoNostrum;
    }

    @Override public void transfer(int cantidad, String cliente) {
        this.bancoNostrumIml.movimiento(cliente,cantidad);
    }

    @Override public int state(String cliente) {
        return this.bancoNostrumIml.estado(cliente);
    }
}
