import * as readline from 'readline'
import { stdin as input, stdout as output } from 'process'
const rl = readline.createInterface({ input, output })
const question = q => new Promise((rs, rj) => rl.question(q + ' ', a => rs(a)))

let soma = 0
let count = 0
let media = 0

while (true) {
    let strNota = await question(`Digite o valor da ${count + 1}° nota para cacular a média entre os valores inseridos ou SAIR para encerrar o programa: `)
    if (strNota.toUpperCase() == 'SAIR') {
        console.log("\u001b[1;31m[ EXIT ]Progama encerrado." + "\u001b[0m");
        console.log(`\u001b[1;36m[ RESULTADO ] A média de todos os valores informados é`, media + "\u001b[0m")
        break
    } else {
        let nota = parseFloat(strNota)
        if (isNaN(nota) || nota < 0) {
            console.log("\u001b[1;31m[ ERROR#1 ] O numero digitado não é valido! Digite novamente!" + "\u001b[0m");
            process.exit()
        }

        soma = soma + nota
        count++

    }
    media = soma / count
    console.log(`\u001b[1;36m[ RESULTADO ] A média de todos os valores informados é`, media + "\u001b[0m")
}
process.exit()