const CheckingAccount = require("./CheckingAccount");

describe("CheckingAccount", () => {
    describe("balance()", () => {
        it("check starting balance", () => {
            const account = new CheckingAccount(100);
            // expect(account.balance()).toBe(100);
        });
    });
});