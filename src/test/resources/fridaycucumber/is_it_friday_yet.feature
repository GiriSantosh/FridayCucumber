Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario Outline: Sunday isn't Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then answer should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | Yes!! It's Friday   |
      | Sunday         | Nope   |
      | anything else! | Nope   |
      | Thursday       | Nope   |
      | Monday         | Nope   |